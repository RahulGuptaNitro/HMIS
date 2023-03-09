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
public class Unit {

	@Transient
	public static final String  id="unitid_seq";
	
	private int unitid;
	private int deptid;
	private String unitname;
	
}
