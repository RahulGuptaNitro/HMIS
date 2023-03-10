package com.hmis.domain;

import org.springframework.data.annotation.Id;
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
	public static final String  idgen="admid_seq";

	@Id
	private int admId;
	private int hid;
	private String name;
	private String dept;
	private String unit;
	private String ward;
	private String bed;
	
}
