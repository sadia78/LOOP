package com.tjt.mail.Service;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.tjt.mail.Entity.EmailEntity;
import com.tjt.mail.MailApplication.Application;

@Service
public class EmailService {
	private static Logger log= LoggerFactory.getLogger(EmailService.class);
	@Autowired
	private JavaMailSender MailSender;
	
	public void sendMessage( EmailEntity emailEntity ) throws MessagingException{
		
		log.info("send Message Methode() execute start");
		EmailEntity mail =new EmailEntity();
		mail.setTo("saipravatkumar1996@gmail.com");
		mail.setSubject("hii");	
		mail.setContent("successful");
		
		MimeMessage msg=MailSender.createMimeMessage();
		log.info("MimeMessage session  execute start");
		MimeMessageHelper helper=new MimeMessageHelper(msg);
		log.info("MimeMessageHelper  execute "+helper);
		//SimpleMailMessage mesaage=new SimpleMailMessage();
		helper.setSubject(mail.getSubject());
		log.info("Mail service subject "+mail.getSubject());
		helper.setTo(mail.getTo());
		log.info("Mail service to "+mail.getTo());
		helper.setBcc(mail.getTo());
		helper.setText(mail.getContent());
		
		MailSender.send(msg);
		log.info("mail send successfully");
		log.info("send Message Methode() execute end");
		
	}
}
