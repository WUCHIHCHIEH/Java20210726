package com.study.day22;

public class LambdaDemo3 {

	public static void main(String[] args) {
		BMI bmi = (double h, double w) -> w / Math.pow(h/100, 2);
		System.out.println(bmi.calc(170, 60));
			
		}
		

	}


