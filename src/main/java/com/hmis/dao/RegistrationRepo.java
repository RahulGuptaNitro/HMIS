package com.hmis.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Registration;

public interface RegistrationRepo extends MongoRepository<Registration, Object>{
	
}
