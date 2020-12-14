package com.example.demo.restcontoller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/email")
public class FunController {

	@Autowired
	private JavaMailSender javaMailSender;

	@GetMapping("/send")
	public String helloString() {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("bharadwaj.anshul09575@gmail.com");
		message.setSubject("springboot Application");
		message.setText("we sent a message");
		javaMailSender.send(message);
		return "j";
	}
}
