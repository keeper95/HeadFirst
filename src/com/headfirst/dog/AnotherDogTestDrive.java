package com.headfirst.dog;

public class AnotherDogTestDrive {

	public static void main(String[] args) {
		AnotherDog one = new AnotherDog();
		AnotherDog two = new AnotherDog();
		AnotherDog three = new AnotherDog();
		
		one.size = 70;
		two.size = 8;
		three.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
	}

}
