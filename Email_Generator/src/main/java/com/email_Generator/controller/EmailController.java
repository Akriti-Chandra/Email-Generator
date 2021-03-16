package com.email_Generator.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email_Generator.beans.Email;
import com.email_Generator.exception.EmailNotSendException;
import com.email_Generator.service.EmailService;
@CrossOrigin
@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public ResponseEntity<?> sendEmail(@RequestBody Email details) throws EmailNotSendException{
		String response = null;
		Map<String,String> map = new HashMap<>();
		try {						
			response = emailService.sendEmail(details);
			map.put("message", response);
		}
		catch (Exception e) {
			throw new EmailNotSendException("Email Not Send!! Please contact Administrator");
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	@GetMapping("/getEmail")
	public String getEmail() {
		return "Testing Email";
	}
}
