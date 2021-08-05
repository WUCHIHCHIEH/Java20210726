package com.study.day22;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Score score = new Score() {
			
			@Override
			public boolean isPassOrFail(int score) {
				if (score>=60) {
					return true;
				}
				return false;
			}
		};
		
		System.out.println(score.isPassOrFail(75));
		System.out.println(score.isPassOrFail(45));
		
		//Lambda
		Score score2 = (int s) -> s >=60;
		Score score3 = (int s) -> s >=60;
	}

}
