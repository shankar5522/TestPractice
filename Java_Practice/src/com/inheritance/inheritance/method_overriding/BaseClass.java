package com.inheritance.method_overriding;

public class BaseClass {

	public BaseClass() {
		System.out.println("Constructor of Parent");
	}

	void disp(){
		System.out.println("Parent Override Method");
	}
	
	public void parentMethod() {
		System.out.println("parent display method");
	}

}
