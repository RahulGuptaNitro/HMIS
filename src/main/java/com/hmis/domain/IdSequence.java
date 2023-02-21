package com.hmis.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class IdSequence {

	@Id
    private String id;

    private int seq;
	
}
