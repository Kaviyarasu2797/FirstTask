package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.ArrayOfEmployee;
import com.pojo.EmpDetail;

public class SampleArray {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
	
	File file= new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ArrayEmployee.json");
	
	ObjectMapper mapper=new ObjectMapper();
	
	ArrayOfEmployee emp = mapper.readValue(file,ArrayOfEmployee.class);
	String email = emp.getEmail();
	System.out.println(email);
	
	ArrayList<EmpDetail> empDetails = emp.getEmpDetails();
	for (EmpDetail empDetail : empDetails) {
		System.out.println(empDetail.getFirstName());
		System.out.println(empDetail.getCourse());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
