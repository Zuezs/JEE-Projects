package com.eintern.hibernateTest;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailTest {

	public static void sendEmail(String to, String from, String subject, String text, String smtpHost){
	
		try{	
			Properties properties = new Properties();
			properties.put("mail.smtp.host", smtpHost);
			Session emailSession = Session.getDefaultInstance(properties);
			
			Message emailMessage = new MimeMessage(emailSession);
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			emailMessage.setFrom(new InternetAddress(from));
			emailMessage.setSubject(subject);
			emailMessage.setText(text);
			
			Transport.send(emailMessage);
			
			}catch(AddressException e){
				e.printStackTrace();
			}catch(MessagingException e){
				e.printStackTrace();
			}
		
	}
	
}
