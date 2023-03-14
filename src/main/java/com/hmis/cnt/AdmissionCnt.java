package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Admission;
import com.hmis.domain.Bed;
import com.hmis.domain.Department;
import com.hmis.service.AdmissionService;

@RestController
@CrossOrigin("*")
public class AdmissionCnt {
	
	
	@Autowired
	AdmissionService serv;

	
	@GetMapping("/getAllAdmissions")
	public List<Admission> getAllAdmission() {
		return serv.getAllAdmission();
	}
	
	@GetMapping("/getAdmissionById/{id}")
	public Department getAdmissionById(@PathVariable int id) {
		return null;
	}
	
	@PostMapping("/saveAdmission")
	public boolean saveAdmission(@RequestBody Admission adm) {
		serv.saveAdmission(adm);
		return true;
	}

}
