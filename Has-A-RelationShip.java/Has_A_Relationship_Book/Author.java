package com.jsp.Has_A_Relationship_Book;

public class Author {
private String name;
private String email;
private long cno;
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Author(String name,String email,long cno) {
	this.name=name;
	this.email=email;
	this.cno=cno;
	
}

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

public long getCno() {
	return cno;
}

public void setCno(long cno) {
	this.cno = cno;
}

public void printAuthorDetails() {
	System.out.println("*********");
	System.out.println(name);
	System.out.println(email);
	System.out.println(cno);
	System.out.println("**************");
	if(address!=null) {
	address.printAddressDetails();
		
	}else {
		System.out.println("Address Details Not Mentions");
	}
}

}
