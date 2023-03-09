package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Unit;

public interface UnitRepo  extends MongoRepository<Unit, Object>{

	public Unit findByDeptid(int deptid);
	
}
