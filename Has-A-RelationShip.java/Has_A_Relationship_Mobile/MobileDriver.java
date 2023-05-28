package com.jsp.Has_A_Relationship_Mobile;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m=new Mobile("SumSang","F19","1248",20000);
		m.printAllDetailsMobile();
		
        System.out.println("**************");
        m.setSim1(new Sim1("Airtel",9822977442l));
        m.printAllDetailsMobile();
        
        System.out.println("****************");
        m.setSim2(new Sim2("idea",9657310631l));
        m.printAllDetailsMobile();
        
	}

}
