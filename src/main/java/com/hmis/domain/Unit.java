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
public class Unit {
	
	@Transient
	public static final String  idgen="unitid_seq";

	@Id
	private int unitId;
	private int deptId;
	private String unitName;
	
}
