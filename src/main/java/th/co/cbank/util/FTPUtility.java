package th.co.cbank.util;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

public class FTPUtility {
    private final Logger logger = Logger.getLogger(FTPUtility.class);
    private FTPClient ftp;
    private final Frame frame = new Frame();
    private JLabel lb;
    private JProgressBar pb;
    private JTextArea tx;
    private String server;
    private String user;
    private String pass;
    private String port = "21";

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    public FTPUtility(String server, String user, String pass, String port) {
        this.server = server;
        this.user = user;
        this.pass = pass;
        this.port = port;
    }

    public FTPUtility(String server, String user, String pass, String port, JLabel lb, JProgressBar pb, JTextArea txt) {
        this.server = server;
        this.user = user;
        this.pass = pass;
        this.port = port;
        this.lb = lb;
        this.pb = pb;
        this.tx = tx;
    }

    public void setApplication(JLabel lb, JProgressBar pb) {
        this.lb = lb;
        this.pb = pb;
    }

    public boolean upload(String localFile, String remoteFile) {
        InputStream input;
        OutputStream output;
        boolean success;
        try {
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            File f = new File(localFile);
            if (!f.exists()) {
                return false;
            }
            input = new FileInputStream(localFile);
            output = ftp.storeFileStream(remoteFile);

            if (output == null) {
                return false;
            }

            byte[] buffer = new byte[1024];
            int len;

            while ((len = input.read(buffer)) != -1) {
                output.write(buffer, 0, len);
                output.flush();
            }
            success = true;
            return success;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean download(String fileName, File destination) throws MalformedURLException, IOException {
        boolean downloadSuccess = false;

        if (server != null && fileName != null && destination != null) {
            StringBuilder sb = new StringBuilder("ftp://");
            if (user != null && pass != null) {
                sb.append(user);
                sb.append(':');
                sb.append(pass);
                sb.append('@');
            }
            sb.append(server);
            sb.append('/');
            sb.append(fileName);
            sb.append(";type=i");
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                URL url = new URL(sb.toString());
                URLConnection urlc = url.openConnection();
                bis = new BufferedInputStream(urlc.getInputStream());
                bos = new BufferedOutputStream(new FileOutputStream(destination));
                int i;

                FTPFile[] files = ftp.listFiles(fileName);
                FTPFile file = null;
                for (FTPFile f : files) {
                    if (new File(fileName).getName().equals(f.getName())) {
                        file = f;
                        break;
                    }
                }

                int fileSize = (int) file.getSize();//ได้จำนวน MB ออกมา

                pb.setStringPainted(true);
                pb.setMinimum(0);
                pb.setMaximum(fileSize);

                int count = 0;
                int percent = 0;
                while ((i = bis.read()) != -1) {
                    count++;
                    bos.write(i);
                    pb.setValue(count);
                    pb.setString(NumberFormat.showDouble2(count) + "/" + NumberFormat.showDouble2(fileSize));
                }
                pb.setString("Download file is complete.");
                downloadSuccess = true;
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
                if (bos != null) {
                    try {
                        bos.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        } else {
            downloadSuccess = false;
            System.out.println("Input not available");
        }
        return downloadSuccess;
    }

    public void setProgress(JLabel lb, JProgressBar pb) {
        this.lb = lb;
        this.pb = pb;
        this.pb.setMaximum(100);
        this.pb.setMinimum(0);
        this.pb.setStringPainted(true);
    }

    public boolean connect() {
        ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
        ftp.setDefaultPort(Integer.parseInt(port));
        ftp.setDataTimeout(1000 * 15);

        try {
            int reply;
            ftp.connect(server);
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();                
                return false;
            }
        } catch (NoRouteToHostException e) {
            e.printStackTrace();
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException f) {
                    e.printStackTrace();
                }
            }
//            JOptionPane.showMessageDialog(frame, "ไม่พบ FTP Server : " + server);
            return false;
        } catch (UnknownHostException e) {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException f) {
                    e.printStackTrace();
                }
            }
//            JOptionPane.showMessageDialog(frame, "ไมรู้จัก FTP Server : " + server);
            return false;
        } catch (ConnectException e) {
            e.printStackTrace();
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException f) {
                    e.printStackTrace();
                }
            }
//            JOptionPane.showMessageDialog(null, e.getMessage() + " ConnectException..");
            return false;
        } catch (SocketException e) {
            e.printStackTrace();
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException f) {
                    e.printStackTrace();
//                    JOptionPane.showMessageDialog(null, f.getMessage() + " SocketException..");
                }
            }
//            JOptionPane.showMessageDialog(frame, "เกิดปัญหาการเชื่อมต่อ กรุณาตรวจเช็ค! \n"
//                    + "การเชื่อมต่ออินเตอร์เน็ต หรือ ระบบเน็ตเวิค ของท่าน!!!");
            return false;
        } catch (IOException e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, e.getMessage() + " IOException..");
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException f) {
                    e.printStackTrace();
                }
            }
//            JOptionPane.showMessageDialog(frame, "เกิดปัญหาการเชื่อมต่อ กรุณาตรวจเช็ค! \n"
//                    + "การเชื่อมต่ออินเตอร์เน็ต หรือ ระบบเน็ตเวิค ของท่าน");
            return false;
        }

        try {
            if (!ftp.login(user, pass)) {
                ftp.logout();
                ftp = null;
                this.server = null;
                this.user = null;
                this.pass = null;
                this.port = "21";
                return false;
            }

        } catch (HeadlessException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean disconnect() {
        if (ftp != null) {
            try {
                ftp.logout();
                ftp.disconnect();
                ftp = null;
                this.server = null;
                this.user = null;
                this.pass = null;
                this.port = "21";
                return true;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return false;
    }
}
