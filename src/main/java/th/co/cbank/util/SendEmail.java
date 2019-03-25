package th.co.cbank.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.BranchControl;

public class SendEmail {
    private final Logger logger = Logger.getLogger(SendEmail.class);

    public boolean sendEmailBug(String email, String pass, String subject, String msg) {
        final String username = email;
        final String password = pass;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("natee.live@gmail.com"));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            System.out.println("ส่งข้อมูลการแจ้งปัญหาของท่านไปยังทีมงาน Support โปรแกรมเรียบร้อยแล้ว");
            return true;
        } catch (MessagingException e) {
            System.out.println("พบข้อผิดพลาดในการส่งข้อมูล\n" + e.getMessage());
            return false;
        }
    }

    public boolean sendEmailSecret() throws Exception {
        final String subject = "Login CBMart system "+new Date();
        final String msg = ThaiUtil.ASCII2Unicode(new BranchControl().getData().getName());
        final String username = "natee.live@gmail.com";
        final String password = "p@ssw0rd2535";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("natee.live@gmail.com"));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            System.out.println("ส่งข้อมูลการแจ้งปัญหาของท่านไปยังทีมงาน Support โปรแกรมเรียบร้อยแล้ว");
            return true;
        } catch (MessagingException e) {
            System.out.println("พบข้อผิดพลาดในการส่งข้อมูล\n" + e.getMessage());
            return false;
        }
    }
}
