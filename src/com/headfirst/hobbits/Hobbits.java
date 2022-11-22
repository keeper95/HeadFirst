package com.headfirst.hobbits;

public class Hobbits {

	String name;

	public static void main(String[] args) {
		Hobbits[] hobbits = new Hobbits[3];

		for (int i = 0; i < hobbits.length; i++) {
			hobbits[i] = new Hobbits();
			hobbits[i].name = "Billo";
			if (i == 1) {
				hobbits[i].name = "Frodo";
			}
			if (i == 2) {
				hobbits[i].name = "Sam";
			}
			System.out.print(hobbits[i].name + " is name!");
			System.out.println(" Good hobbit name.");
		}

	}

}
