package com.jsp.Has_A_RelationShip_Car;

public class CarDriver {

	public static void main(String[] args) {
		Car c=new Car("X5","BMW","Black",8900000);
		c.printCarDetails();
		System.out.println("*******************");
		c.setEngine(new Engine("335","2996"));
		c.printCarDetails();

	}

}
