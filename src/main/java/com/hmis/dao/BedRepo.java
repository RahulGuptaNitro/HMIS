package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Bed;

public interface BedRepo  extends MongoRepository<Bed, Object>{

	
	
}
