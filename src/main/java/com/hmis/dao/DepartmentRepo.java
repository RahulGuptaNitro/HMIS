package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Department;

public interface DepartmentRepo extends MongoRepository<Department, Object>{
	
	
}
