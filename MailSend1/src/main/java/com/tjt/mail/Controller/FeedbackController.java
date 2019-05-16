package com.tjt.mail.Controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tjt.mail.Entity.EmailConfig;
import com.tjt.mail.Entity.EmailFeeedback;
@RestController


@RequestMapping("/feedback")

public class FeedbackController {
	@Autowired
	private EmailConfig emailConfig;
	
	@Autowired
	private JavaMailSender sender;

	@PostMapping("send")
	public void sendFeedBack(@RequestBody EmailFeeedback emailFeedback,
			BindingResult bindingResult ) throws MessagingException{
		if(bindingResult.hasErrors()){
			throw new ValidationException("feedback is not valid");
		}
		//create a new mail
		JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
		MimeMessage maa=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(maa);
		
		helper.setFrom(emailFeedback.getEmail());
		helper.setTo("sadiaazim21@gmail.com");
		helper.setSubject("New feedback from");
		helper.setText("hello");
	}

}
