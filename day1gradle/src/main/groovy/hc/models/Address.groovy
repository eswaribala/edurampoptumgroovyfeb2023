package hc.models

class Address {
	long addressId;
	String doorNo;
	String streetName;
	String city;
	String state;
	public Address(String doorNo, String streetName, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	
}
