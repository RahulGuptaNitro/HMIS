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
public class Ward {
	
	@Transient
	public static final String  idgen="wardid_seq";

	@Id
	private int wardId;
	private int deptId;
	private int unitId;
	private String wardName;
	
}
