package com.qa.ConsumeApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.BabyApi.persistence.domain.POJOName;
import com.qa.ConsumeApi.repository.POJONameRepository;

@Service
public class POJONameService {
	
	@Autowired
	private POJONameRepository repo;
	
	public POJOName addToDb(POJOName nameToAdd) {		
		//repo.insert(nameToAdd);
		repo.save(nameToAdd);
		return nameToAdd;
	}

}
