package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Bed;
import com.hmis.domain.Department;
import com.hmis.domain.Ward;
import com.hmis.service.BedService;

@RestController
@CrossOrigin("*")
public class BedCnt {
	
	
	@Autowired
	BedService serv;

	
	@GetMapping("/getAllBed")
	public List<Bed> getAllBed() {
		return serv.getAllBed();
	}
	
	@GetMapping("/getBedById/{id}")
	public Department getBedById(@PathVariable int id) {
		return null;
	}
	
	
	@PostMapping("/saveBed")
	public boolean saveBed(@RequestBody Bed bed) {
		serv.saveBed(bed);
		return true;
	}
	
	@GetMapping("/getBedByWardId/{id}")
	public List<Bed> getBedByWardId(@PathVariable int id) {
		return serv.getBedByWardId(id);
	}

}
