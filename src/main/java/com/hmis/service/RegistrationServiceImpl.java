package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.RegistrationRepo;
import com.hmis.domain.Registration;


@Service
public class RegistrationServiceImpl implements RegistrationService{

	
	@Autowired
	RegistrationRepo repo;
	
	@Override
	public List<Registration> getAllPatient() {
		
		return repo.findAll();
	}

	@Override
	public Registration getPatientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePatient(Registration reg) {
		
		repo.save(reg);
	}

	@Override
	public boolean updatePatient(Registration reg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatient(Registration reg) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
