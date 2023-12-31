package com.mail.mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendSimpleEmail(String toEmail, String body, String subject) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		message.setFrom("prtushmewara1999@gmail.com");
		javaMailSender.send(message);
		System.out.println("Mail Send.....");

	}

}
