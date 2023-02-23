package hc.models

import groovy.transform.Canonical

//@Canonical
class Doctor {
	//auto generated setters and getters
	private long mobileNo
	private String firstName;
	private String lastName;
	//associated- one to many
	private List<Address> addressList;
	private String email
	private  String regNo
	private Gender gender

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName=$firstName, MobileNo=$mobileNo";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Doctor doctorObj=obj;
		return doctorObj.mobileNo==this.mobileNo
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1
	}

	
	
	
}
