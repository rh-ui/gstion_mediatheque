import javax.mail.*;
import javax.mail.internet.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.activation.*;


public class test {

    public static void main(String[] args) {

        String host = "smtp.gmail.com";
        String port = "587"; // Port SMTP pour Gmail
        String username = "souhaibtissam2001@gmail.com";
        String password = "zvoawklbbcbdcdwu";

        // Propriétés pour la session
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Création de la session avec authentification
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Création du message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("souhaibtissam2001@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("bettyelle43@gmail.com"));
            message.setSubject("Lettre de relance");
            message.setText("On vous rappel que vous n'avez pas encore rendu vos prêts !!");

            // Envoi du message
            //props.put("mail.smtp.ssl.protocols", "TLSv1.2");
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
