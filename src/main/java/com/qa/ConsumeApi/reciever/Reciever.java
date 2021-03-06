package com.qa.ConsumeApi.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qa.BabyApi.persistence.domain.POJOName;
import com.qa.ConsumeApi.service.POJONameService;

@CrossOrigin
@Component
public class Reciever {
	
	@Autowired
	private POJONameService service;
	
	@JmsListener(destination = "nameQueue", containerFactory = "myFactory")
	public POJOName receiveMessage(POJOName nameToAdd) {
		return service.addToDb(nameToAdd);
	}
	
	@JmsListener(destination = "deleteQueue", containerFactory = "myFactory")
	public String receiveDeleteMessage(POJOName nameToDelete) {
		return service.deleteFromDb(nameToDelete);
	}
	
	@JmsListener(destination = "updateQueue", containerFactory = "myFactory")
	public String receiveUpdateMessage(POJOName nameToUpdate) {
		return service.updateDb(nameToUpdate);
	}

}
