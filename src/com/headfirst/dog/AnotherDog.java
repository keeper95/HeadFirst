package com.headfirst.dog;

public class AnotherDog {
	int size;
	String name;

	void bark() {
		if (size > 60) {
			System.out.println("Wooof wooooof!");
		} else if (size > 14) {
			System.out.println("Ruufff Ruuff!");
		} else {
			System.out.println("Yip Yip!");
		}
	}

}
