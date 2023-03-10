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
import com.hmis.service.BedService;

@RestController
@CrossOrigin("*")
public class BedCnt {
	
	@Autowired
	BedService serv;
	
	@GetMapping("/getBedByWard/{id}")
	public List<Bed> getBedByWard(@PathVariable int id) {
		return serv.getBedByWard(id);
	}

	@PostMapping("/saveBed")
	public boolean saveBed(@RequestBody Bed bed) {
		serv.saveBed(bed);
		return true;
	}
	
}

