package com.hmis.service;

import java.util.List;

import com.hmis.domain.Department;

public interface DepartmentService {
	
	public List<Department> getAllDepartment();
	
	public Department getDepartmentById(int id);
	
	public void saveDepartment(Department dept);
	
	public boolean updateDepartment(Department dept);
	
	public boolean deleteDepartment(Department dept);

}
