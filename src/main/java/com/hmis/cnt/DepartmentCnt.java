package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Department;
import com.hmis.service.DepartmentService;

@RestController
@CrossOrigin("*")
public class DepartmentCnt {
	
	
	@Autowired
	DepartmentService serv;

	
	@GetMapping("/getAllDepartment")
	public List<Department> getAllDepartment() {
		return serv.getAllDepartment();
	}
	
	@GetMapping("/getDepartmentById/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return serv.getDepartmentById(id);
	}
	
	
	@PostMapping("/saveDepartment")
	public boolean saveDepartment(@RequestBody Department dept) {
		serv.saveDepartment(dept);
		return true;
	}

}
