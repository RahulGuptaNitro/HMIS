package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Department;
import com.hmis.domain.Unit;
import com.hmis.service.UnitService;

@RestController
@CrossOrigin("*")
public class UnitCnt {
	
	
	@Autowired
	UnitService serv;

	
	@GetMapping("/getAllUnit")
	public List<Unit> getAllUnit() {
		return serv.getAllUnit();
	}
	
	@GetMapping("/getUnitById/{id}")
	public Unit getUnitById(@PathVariable int id) {
		return null;
	}
	
	@GetMapping("/getUnitByDeptid/{id}")
	public List<Unit> getUnitByDeptId(@PathVariable int id) {
		return serv.getUnitByDeptId(id);
	}
	
	
	@PostMapping("/saveUnit")
	public boolean saveUnit(@RequestBody Unit unit) {
		serv.saveUnit(unit);
		return true;
	}

}
