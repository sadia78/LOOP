package com.tjt.mail.Controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tjt.mail.Entity.EmailEntity;
import com.tjt.mail.Service.EmailService;

@Controller
public class MailController {
	@Autowired
	private EmailService emailService;
	@RequestMapping(value="sendMail",method=RequestMethod.GET)
	@ResponseBody
	public String  sendMessage(EmailEntity emailEntity) throws MessagingException{
		
		emailService.sendMessage(emailEntity);
		return "sadia";
	}

}
