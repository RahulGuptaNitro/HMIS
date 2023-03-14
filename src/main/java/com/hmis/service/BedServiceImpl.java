package com.hmis.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.BedRepo;
import com.hmis.domain.Bed;
import com.hmis.domain.Unit;
import com.hmis.domain.Ward;


@Service
public class BedServiceImpl implements BedService {
	
	@Autowired
	BedRepo repo;
	
	@Autowired
	NextSeqService seq;


	@Override
	public List<Bed> getAllBed() {
		// TODO Auto-generated method stub

		return repo.findAll();
	}

	@Override
	public Bed getBedById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBed(Bed bed) {
		// TODO Auto-generated method stub
		for (int i=1;i<=bed.getBedcount();i++) {
			bed.setBedid(Integer.parseInt(bed.getDeptid()+""+bed.getUnitid()+""+bed.getWardid()+""+i));
			bed.setBedname("Bed-"+i);
			repo.save(bed);
		}
	}

	@Override
	public List<Bed> getBedByWardId(int id) {
		List<Bed> r=repo.findAll();
		return r.stream().filter(bed->bed.getWardid()==id && bed.getVacant()==1).collect(Collectors.toList());
	}

	@Override
	public boolean updateBed(Bed bed) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBed(Bed bed) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
