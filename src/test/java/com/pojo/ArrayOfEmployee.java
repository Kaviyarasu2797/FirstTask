package com.pojo;

import java.util.ArrayList;

public class ArrayOfEmployee {

	    private String name;
	    private String email;
	    private long phoneno;
	    private ArrayList<EmpDetail> empDetails;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		public ArrayList<EmpDetail> getEmpDetails() {
			return empDetails;
		}
		public void setEmpDetails(ArrayList<EmpDetail> empDetails) {
			this.empDetails = empDetails;
		}
	

	
	
}
