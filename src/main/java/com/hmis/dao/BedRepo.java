package com.hmis.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Bed;


public interface BedRepo extends MongoRepository<Bed, Object> {

	public List<Bed> findByWardId(int wardId);
}
