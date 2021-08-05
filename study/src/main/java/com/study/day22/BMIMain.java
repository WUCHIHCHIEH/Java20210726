package com.study.day22;

public class BMIMain {

	public static void main(String[] args) {
		BMI  bmi = new BMI() {
			
			@Override
			public double calc(double h, double w) {
				double result = w / Math.pow(h/100, 2);
				return result;
			}
		};
		System.out.println(bmi.calc(175.5, 72.5));
	}

}
