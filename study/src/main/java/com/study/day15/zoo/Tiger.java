package com.study.day15.zoo;

public class Tiger extends Animal {
	Tiger() {
		System.out.println("Tiger 物件被建立");
		setLegs(4); // 設定腳數
	}
	
	// 覆寫
	@Override
	void move() {
		System.out.println("我會跑");
	}
}
