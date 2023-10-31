package com.auto.xml;

public class Student {

	public Adress adress;
	
	

	public Student(Adress adress) {
System.out.println("constructor injection");
		this.adress = adress;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [adress=" + adress + "]";
	}
	
	
}
