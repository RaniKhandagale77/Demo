package com.jsp.Has_A_Relationship_Mobile;

public class Sim1 {
	private String service_Provider;
	private long cno;
	
	public Sim1(String service_Provider,long cno) {
		this.service_Provider=service_Provider;
		this.cno=cno;
		
	}

	public String getService_Provider() {
		return service_Provider;
	}

	public void setService_Provider(String service_Provider) {
		this.service_Provider = service_Provider;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}
	public void printSim1Details() {
		System.out.println("******Sim1******");
		System.out.println("Sim1 Config");
		System.out.println(service_Provider+" is a service_provider");
		System.out.println(cno+"is a contact no");
	
	}

}
