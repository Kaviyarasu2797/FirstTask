package com.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.Employee;

public class Sample {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
	File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Employee.json");
	
	// create object for mapper
	
	ObjectMapper mapper=new ObjectMapper();
	
	// pass the json file to fetch value
	Employee emp = mapper.readValue(file, Employee.class);
	String name = emp.getName();
	System.out.println(name);
	//address
	Address address = emp.getAddress();
	System.out.println(address.getState());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
