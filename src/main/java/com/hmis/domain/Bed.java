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
public class Bed {
	
	@Transient
	public static final String  idgen="bedid_seq";

	@Id
	private String bedId;
	private int deptId;
	private int unitId;
	private int wardId;
    @Transient
	private int bedCount;
	private String BedName;
	private boolean vaccant=true;
	
}
