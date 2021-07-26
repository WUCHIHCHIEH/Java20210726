package com.study.day02;


//設計BMI 類別物件
//需求 :存放 人名 身高 體重 <-- 屬性

public class BMI {
	String name; //人名
	double height; //身高
	double weight; //體重
	
	// 取得bmi的計算結果(計算結果也就是回傳值是double)
	double getBmiValue() {
		double bmi =weight / Math.pow(height/100, 2);
		return bmi;		
	}
	
}
