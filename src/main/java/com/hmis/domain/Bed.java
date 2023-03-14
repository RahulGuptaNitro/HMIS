package com.hmis.domain;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Bed {

	@Transient
	public static final String  id="bedid_seq";
	
	@Transient
	private int bedcount;
	
	private int wardid;
	private int unitid;
	private int deptid;
	private int bedid;
	private String bedname;
	private int vacant=1;
	
}
