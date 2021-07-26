package com.study.day01;

public class HelloBMI {

	public static void main(String[] args) {
		double h = 170;
		double w = 60;
		double bmi = w /Math.pow(h/100,2);
		System.out.printf("bmi = %.2f\n", bmi );
	}

}
