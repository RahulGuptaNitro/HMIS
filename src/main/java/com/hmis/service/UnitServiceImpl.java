package com.hmis.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.UnitRepo;
import com.hmis.domain.Unit;


@Service
public class UnitServiceImpl implements UnitService {
	
	@Autowired
	UnitRepo repo;
	
	@Autowired
	NextSeqService seq;

	
	@Override
	public List<Unit> getAllUnit() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public Unit getUnitById(int id) {
		return null;
	}
	
	@Override
	public List<Unit> getUnitByDeptId(int id) {
		List<Unit> r=repo.findAll();
		return r.stream().filter(unit->unit.getDeptid()==id).collect(Collectors.toList());
	}

	@Override
	public void saveUnit(Unit unit) {
		// TODO Auto-generated method stub
		
		unit.setUnitid(seq.getNextSequence(Unit.id));
		repo.save(unit);
		
	}

	@Override
	public boolean updateUnit(Unit unit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUnit(Unit unit) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
