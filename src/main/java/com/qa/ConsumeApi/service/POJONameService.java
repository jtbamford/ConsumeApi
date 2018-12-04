package com.qa.ConsumeApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.BabyApi.domain.POJOName;
import com.qa.ConsumeApi.repository.POJONameRepository;

@Service
public class POJONameService {
	
	@Autowired
	private POJONameRepository repo;
	
	//@Autowired
	//private JSONUtil util;
	
	public POJOName addToDb(POJOName nameToAdd) {		
		//POJOAccount accountToAdd = new POJOAccount();
		//accountToAdd=util.fromJSON(account, POJOAccount.class);
		repo.insert(nameToAdd);
		return nameToAdd;
	}

}
