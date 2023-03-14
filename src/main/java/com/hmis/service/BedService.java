package com.hmis.service;

import java.util.List;

import com.hmis.domain.Bed;

public interface BedService {
	
	public List<Bed> getAllBed();
	
	public Bed getBedById(int id);
	
	public void saveBed(Bed bed);
	
	public boolean updateBed(Bed bed);
	
	public boolean deleteBed(Bed bed);
	
	public List<Bed> getBedByWardId(int id);

}
