package com.hmis.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.WardRepo;
import com.hmis.domain.Unit;
import com.hmis.domain.Ward;


@Service
public class WardServiceImpl implements WardService {
	
	@Autowired
	WardRepo repo;
	
	@Autowired
	NextSeqService seq;

	
	@Override
	public List<Ward> getAllWard() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public Ward getWardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveWard(Ward ward) {
		// TODO Auto-generated method stub
		
		ward.setWardid(seq.getNextSequence(Ward.id));
		repo.save(ward);
		
	}
	
	@Override
	public List<Ward> getWardByUnitId(int id) {
		List<Ward> r=repo.findAll();
		return r.stream().filter(unit->unit.getUnitid()==id).collect(Collectors.toList());
	}

	@Override
	public boolean updateWard(Ward ward) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWard(Ward ward) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
