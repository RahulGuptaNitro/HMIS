package com.hmis.service;

import java.util.List;

import com.hmis.domain.Admission;

public interface AdmissionService {
	
	public List<Admission> getAllAdmission();
	
	public Admission getAdmissionById(int id);
	
	public void saveAdmission(Admission adm);
	
	public boolean updateAdmission(Admission adm);
	
	public boolean deleteAdmission(Admission adm);

}
