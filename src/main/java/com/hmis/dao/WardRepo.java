package com.hmis.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Ward;

public interface WardRepo extends MongoRepository<Ward, Object>{
	
	public List<Ward> findByUnitId(int unitId);
}
