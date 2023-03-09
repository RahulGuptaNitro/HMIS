package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.DepartmentRepo;
import com.hmis.domain.Department;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	
	@Autowired
	DepartmentRepo repo;
	
	@Autowired
	NextSeqService seq;

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		dept.setDeptid(seq.getNextSequence(Department.id));
		repo.save(dept);
		
	}

	@Override
	public boolean updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDepartment(Department dept) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
