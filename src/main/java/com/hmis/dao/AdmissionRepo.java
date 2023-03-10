package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Admission;


public interface AdmissionRepo extends MongoRepository<Admission, Object> {
	
}
