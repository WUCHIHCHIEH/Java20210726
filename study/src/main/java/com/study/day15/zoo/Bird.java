package com.study.day15.zoo;

public class Bird extends Animal{
	public Bird() {
		System.out.println("Bird物件被建立");
		setLegs(2);
	}
	@Override
	void move() {
		System.out.println("我會飛");
	}
	void birth() {
		System.out.println("我從蛋殼冒出來");
	}
}
