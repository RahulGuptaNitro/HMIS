package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.BedRepo;
import com.hmis.domain.Bed;

@Service
public class BedSeviceImpl implements BedService{
	
	@Autowired
	NextSeqService seq;
	
	@Autowired
	BedRepo repo;

	@Override
	public boolean saveBed(Bed bed) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=bed.getBedCount();i++) { 
			bed.setBedId(bed.getDeptId()+""+bed.getUnitId()+""+bed.getWardId()+""+i);
			bed.setBedName("BED-"+i);
			repo.save(bed);
		}
	return true;
	}

	@Override
	public List<Bed> getBedByWard(int wardId) {
		// TODO Auto-generated method stub
		return repo.findByWardId(wardId);
	}

}
