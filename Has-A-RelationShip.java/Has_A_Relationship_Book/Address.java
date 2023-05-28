package com.jsp.Has_A_Relationship_Book;

public class Address {
private String streetName;
private String state;
private String city;

public Address(String streetName,String state,String city) {
	this.streetName=streetName;
	this.state=state;
	this.city=city;
	
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public void printAddressDetails() {
	System.out.println(streetName);
	System.out.println(state);
	System.out.println(city);
	
	
	
}
}
