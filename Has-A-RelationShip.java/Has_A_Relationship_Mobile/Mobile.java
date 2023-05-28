package com.jsp.Has_A_Relationship_Mobile;

public class Mobile {
private String name;
private String brand;
private String ram;
private double price;
private Sim1 sim1;
private Sim2 sim2;


public Mobile(String name,String brand,String ram,double price) {
	this.name=name;
	this.brand=brand;
	this.ram=ram;
	this.price=price;
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getRam() {
	return ram;
}


public void setRam(String ram) {
	this.ram = ram;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public Sim1 getSim1() {
	return sim1;
}


public void setSim1(Sim1 sim1) {
	this.sim1 = sim1;
}


public Sim2 getSim2() {
	return sim2;
}


public void setSim2(Sim2 sim2) {
	this.sim2 = sim2;
}
public void printAllDetailsMobile() {
	System.out.println("Mobile Config");
	System.out.println("Mobile name is " + name);
	System.out.println("Mobile brand is " + brand);
	System.out.println("Mobile cost is " + price);
	System.out.println("Mobile Ram is " + ram);
	if(sim1!=null) {
		sim1.printSim1Details();
	}else {
		System.out.println("Sim1 is not inserted");
	}
	if(sim2!=null) {
		sim2.printSim2Details();
	}else {
		System.out.println("Sim2 is not inserted");
	}
}
}
