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
public class Ward {

	@Transient
	public static final String  id="wardid_seq";
	
	private int wardid;
	private int unitid;
	private int deptid;
	private String wardname;
	
}
