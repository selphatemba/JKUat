package com.JKUat.sendEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailjava {
    public static void main(String[] args) throws EmailException {
        System.out.println("==============test started==================");
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("systechinterns@gmail.com", "Systech123"));
        email.setSSLOnConnect(true);
        email.setFrom("systechinterns@gmail.com");
        email.setSubject("TestMail from selpha");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("selphatemba@gmail.com");
        email.send();
        System.out.println("==============email sent==================");
    }
}
