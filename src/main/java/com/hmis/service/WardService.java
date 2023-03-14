package com.hmis.service;

import java.util.List;

import com.hmis.domain.Ward;

public interface WardService {
	
	public List<Ward> getAllWard();
	
	public Ward getWardById(int id);
	
	public void saveWard(Ward ward);
	
	public boolean updateWard(Ward ward);
	
	public boolean deleteWard(Ward ward);
	
	public List<Ward> getWardByUnitId(int id);

}
