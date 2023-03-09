package com.hmis.service;

import java.util.List;

import com.hmis.domain.Department;
import com.hmis.domain.Unit;

public interface UnitService {
	
	public List<Unit> getAllUnit();
	
	public Unit getUnitById(int id);
	
	public List<Unit> getUnitByDeptId(int id);
	
	public void saveUnit(Unit unit);
	
	public boolean updateUnit(Unit unit);
	
	public boolean deleteUnit(Unit unit);

}
