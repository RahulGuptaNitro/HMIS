package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Ward;

public interface WardRepo  extends MongoRepository<Ward, Object>{

	
	
}
