package com.headfirst.dog;

public class Dog {

	String name;

	public static void main(String[] args) {

		Dog firstDog = new Dog();
		Dog secondDog = new Dog();
		Dog thirdDog = new Dog();
		firstDog.bark();
		firstDog.name = "Bart";

		Dog[] myDogs = new Dog[3];

		myDogs[0] = thirdDog;
		myDogs[1] = secondDog;
		myDogs[2] = firstDog;

		thirdDog.name = "Fred";
		secondDog.name = "Marge";

		System.out.println("last dog`s name is " + myDogs[2].name);

		for (int i = 0; i < myDogs.length; i++) {
			myDogs[i].bark();
		}
	}

	public void bark() {
		System.out.println(name + " says Ruff!");
	}

	public void eat() {
	}

	public void chaseCat() {
	}

}
