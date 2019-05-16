package com.tjt.mail;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tjt.mail.Entity.EmailEntity;
import com.tjt.mail.Service.EmailService;

@SpringBootApplication

public class MailApplication {
	public static class  Application implements ApplicationRunner{
	private static Logger log= LoggerFactory.getLogger(Application.class);
			@Autowired
			private EmailService emailService;
	

	public static void main(String[] args) throws Exception  {
		SpringApplication.run(MailApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	EmailEntity mail =new EmailEntity();

	emailService.sendMessage(mail);
	}
	}
}