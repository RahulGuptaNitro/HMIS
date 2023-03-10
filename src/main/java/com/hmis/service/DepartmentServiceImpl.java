package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.DepartmentRepo;
import com.hmis.domain.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	NextSeqService seq;
	
	@Autowired
	DepartmentRepo repo;

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		dept.setDeptId(seq.getNextSequence(Department.idgen));
	    System.out.println(dept);
		repo.save(dept);
	}

}
