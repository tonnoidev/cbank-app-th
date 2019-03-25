package th.co.cbank.project.control;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.log.Log;

public class MySQLConnect {
    private final Logger logger = Logger.getLogger(MySQLConnect.class);
    private String CLASS_NAME;
    public static String SERVER;
    public static boolean USE_FINGER = false;
    private String USER;
    private String PASS;
    public static String DATABASE;
    public static String DATABASE_MEMBER;
    public static Connection conn;
    private int PORT;
    private String CHARSET;

    public MySQLConnect() {
        CLASS_NAME = "com.mysql.jdbc.Driver";

        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("itfinger_conf.txt");
            prop.load(input);

            SERVER = prop.getProperty("server");
            DATABASE = prop.getProperty("database");
            DATABASE_MEMBER = prop.getProperty("database_member");
            if (DATABASE_MEMBER == null || DATABASE_MEMBER.equals("")) {
                DATABASE_MEMBER = "";
            }
            USER = prop.getProperty("username");
            PASS = prop.getProperty("password");
            PORT = Integer.parseInt(prop.getProperty("port"));
            CHARSET = prop.getProperty("charset");
            String uUSE_FINGER = prop.getProperty("use_finger");
            if (uUSE_FINGER != null) {
                USE_FINGER = uUSE_FINGER.equalsIgnoreCase("Y");
            }
            Value.PATH_SCAN = prop.getProperty("pathscan");
            Value.PATH_EXE = prop.getProperty("pathexe");
            Value.MACNO = prop.getProperty("macno");
            if (Value.PATH_SCAN == null) {
                //JOptionPane.showMessageDialog(null, "กรุณาตั้งค่าระบบ Path สำหรับ Scan ลายนิ้วมือก่อนใช้งานโปรแกรม");
                //System.exit(0);
            }
            if (Value.PATH_EXE == null) {
                //JOptionPane.showMessageDialog(null, "กรุณาตั้งค่าระบบ Path โปรแกรมสำหรับ Scan ลายนิ้วมือก่อนใช้งานโปรแกรม");
                //System.exit(0);
            }
            input.close();
        } catch (IOException e) {
            Log.write.error(e.getMessage());
        }

        connect();
    }

    private Connection connect() {
        try {
            Class.forName(CLASS_NAME);
            System.out.println("Driver Loaded.");

            String jdbcUrl = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE + "?charset=" + CHARSET;
            conn = DriverManager.getConnection(jdbcUrl, USER, PASS);
            System.out.println("Connected. " + conn);
            System.out.println(":" + jdbcUrl);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ไม่สามารถเชื่อมต่อฐานข้อมูลได้ กรุณาตรวจสอบ !!!");
            e.printStackTrace();
            if (SERVER == null) {
                System.exit(0);
            }
        }

        return conn;
    }

    public static Statement getStatement() throws Exception {
        if (conn == null) {
            return null;
        } else {
            return conn.createStatement();
        }
    }

    public static ResultSet getResultSet(String sql) throws Exception {
        if (conn == null) {
            return null;
        } else {
            return getStatement().executeQuery(sql);
        }
    }

    public static int exeUpdate(String sql) throws Exception {
        if (conn == null) {
            return -1;
        } else {
            return conn.createStatement().executeUpdate(sql);
        }
    }

    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection Closed.");
            }
        } catch (SQLException e) {
            Log.write.error(e.getMessage());
        }
    }
}
