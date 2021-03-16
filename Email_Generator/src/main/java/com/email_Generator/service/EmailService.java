package com.email_Generator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email_Generator.beans.Email;
import com.email_Generator.exception.EmailNotSendException;
@Service
public class EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String from;
	
	public String sendEmail(Email details) throws EmailNotSendException{
		try {
			System.out.println("Sending Email");
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom(from);
			simpleMailMessage.setTo(details.getEmail());
			simpleMailMessage.setText(details.getInterview_transcription());
			javaMailSender.send(simpleMailMessage);
			System.out.println("Email Sent...");
		}
		catch(Exception ex) {
			System.out.println(ex);
			throw new EmailNotSendException("Some problem with sending Email....");
		}
		return "Email Send Successfully to "+details.getEmail();		
	}
}
