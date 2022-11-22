package com.headfirst.echo;

public class EchoTestDrive {

	public static void main(String[] args) {
		
		Echo echo = new Echo();
		
		for (int i = 0; i < 4; i++ ) {
			echo.hello();
			if (echo.count == 0) {
				echo.count = echo.count + 10;
			}
		}
		System.out.println(echo.count);
	}
}
