package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Registration;

public interface RegistrationRepo extends MongoRepository<Registration, Object>{
	
	public Registration findByHid(int hid);
	
}
