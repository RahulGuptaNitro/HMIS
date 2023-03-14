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
public class Admission {

	@Transient
	public static final String  id="admid_seq";
	
	private int admid;
	private int wardid;
	private int unitid;
	private int deptid;
	private int bedid;
	private int hid;
	
}
