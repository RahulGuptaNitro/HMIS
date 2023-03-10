package com.hmis.service;

import java.util.List;

import com.hmis.domain.Registration;

public interface RegistrationService {
	
	public List<Registration> getAllPatient();
	
	public Registration getPatientById(int id);
	
	public void savePatient(Registration reg);
	
	public boolean updatePatient(Registration reg);
	
	public boolean deletePatient(Registration reg);

}
