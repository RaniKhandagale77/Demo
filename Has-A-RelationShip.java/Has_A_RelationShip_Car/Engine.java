package com.jsp.Has_A_RelationShip_Car;

public class Engine {
	private String house_Power;
	private String cubic_Capacity;
	
	public Engine(String house_Power,String cubic_Capacity) {
		this.house_Power=house_Power;
		this.cubic_Capacity=cubic_Capacity;
		
		
	}

	public String getHouse_Power() {
		return house_Power;
	}

	public void setHouse_Power(String house_Power) {
		this.house_Power = house_Power;
	}

	public String getCubic_Capacity() {
		return cubic_Capacity;
	}

	public void setCubic_Capacity(String cubic_Capacity) {
		this.cubic_Capacity = cubic_Capacity;
	}

}
