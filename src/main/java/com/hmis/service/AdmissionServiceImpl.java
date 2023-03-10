package com.hmis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.AdmissionRepo;
import com.hmis.domain.Admission;

@Service
public class AdmissionServiceImpl implements AdmissionService{
	
	@Autowired
	NextSeqService seq;
	
	@Autowired
	AdmissionRepo repo;

	@Override
	public boolean saveAdmission(Admission adm) {
		// TODO Auto-generated method stub
		adm.setAdmId(seq.getNextSequence(Admission.idgen));
		repo.save(adm);
		return true;
	}

}
