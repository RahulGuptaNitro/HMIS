package com.hmis.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Registration {
	
	@Transient
	public static final String  id="hid_seq";
	
	private int hid;
    private String fname;
    private String mname;
    private String lname;
    private Date dob;
    private String gender;
    private String marital_status;
    private String father_name;
    private String mother_name;
    private int phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private int pincode;
    private String country;
    private String caste;
    private String department;
    private String unit;
    private String insured;
    private String reg_mode;
    private String isvalid;
    private int update_id;
    private String create_time;
    private String ipaddress;
    private String macaddress;
    
    
	    
}
