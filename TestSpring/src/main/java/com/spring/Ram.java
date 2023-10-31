package com.spring;

public class Ram implements Action{

	private int age;
	
	private food food;
	
	
	public food getFood() {
		return food;

	}
	

	public Ram(int age) {
		this.age = age;
	}


	public void setFood(food food) {
		this.food = food;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * public Ram() { System.out.println("obj is created"); food.cook();
	 * 
	 * }
	 */
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ram eating ");

		
	}

	public void sleep() {     
		// TODO Auto-generated method stub
		System.out.println("ram sleep");
		
	}

}
