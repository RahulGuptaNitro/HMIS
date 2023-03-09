package com.hmis.cnt;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Registration;
import com.hmis.service.RegistrationService;

@RestController
@CrossOrigin("*")
public class RegistrationCnt {
	
	
	@Autowired
	RegistrationService regserv;

	
	@GetMapping("/getAllPatient")
	public List<Registration> getAllPatient() {
		List<Registration> pats=regserv.getAllPatient();
		return pats.stream().filter(pat->pat.isIsvalid()==true).collect(Collectors.toList());
	}
	
	@GetMapping("/getPatientById/{id}")
	public Registration getPatientById(@PathVariable int id) {
		return regserv.getPatientById(id);
	}
	
	
	@GetMapping("/getPatientCount")
	public Integer getPatientCount() {
		List<Registration> pats=regserv.getAllPatient();
		return (int) pats.stream().filter(pat->pat.isIsvalid()==true).count();
	}
	
	
	@PostMapping("/savePatient")
	public boolean savePatient(@RequestBody Registration pat) {
		regserv.savePatient(pat);
		return true;
	}

}
