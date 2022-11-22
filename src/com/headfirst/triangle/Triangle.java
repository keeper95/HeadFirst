package com.headfirst.triangle;

public class Triangle {
	double area;
	int heigth;
	int length;

	public static void main(String[] args) {
		Triangle[] triangle = new Triangle[4];

		for (int i = 0; i < 4; i++) {
			triangle[i] = new Triangle();
			triangle[i].heigth = (i + 1) * 2;
			triangle[i].length = i + 4;
			triangle[i].setArea();
			System.out.println("triangle " + i + ", area" + " = " + triangle[i].area);

		}

		int i = triangle.length;
		Triangle triangle5 = triangle[2];
		triangle5.area = 343;
		System.out.println("y = " + i + ", triangle 4 , area = " + triangle5.area);

	}

	void setArea() {
		area = (heigth * length) / 2;
	}

}
