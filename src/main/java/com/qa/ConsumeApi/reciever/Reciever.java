package com.qa.ConsumeApi.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qa.BabyApi.domain.POJOName;
import com.qa.ConsumeApi.service.POJONameService;

@CrossOrigin
@Component
public class Reciever {
	
	@Autowired
	private POJOName name;
	
	@Autowired
	private POJONameService service;
	
	@JmsListener(destination = "accountQueue", containerFactory = "myFactory")
	public POJOName receiveMessage(POJOName nameToAdd) {
		return service.addToDb(nameToAdd);
	}

}
