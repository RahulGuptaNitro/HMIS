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
public class Department {
	
	@Transient
	public static final String  id="deptid_seq";
	
	
	private int deptid;
	private String deptname;

}
