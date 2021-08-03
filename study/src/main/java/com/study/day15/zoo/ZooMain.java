package com.study.day15.zoo;

public class ZooMain {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
//		System.out.printf("%s 有 %d 條腿\n", 
//				tiger.getClass().getSimpleName(), 
//				tiger.getLegs());
//		tiger.move();
		printAnimal(tiger);
		
		Fish fish = new Fish();
//		System.out.printf("%s 有 %d 條腿\n", 
//				fish.getClass().getSimpleName(), 
//				fish.getLegs());
//		fish.move();
		printAnimal(fish);
		Bird bird = new Bird();
//		System.out.printf("%s 有 %d 條腿\n", 
//				bird.getClass().getSimpleName(), 
//				bird.getLegs());
//		bird.move();
		printAnimal(bird);
		
		Ostrich ostrich = new Ostrich();
//		System.out.printf("%s 有 %d 條腿\n", 
//				ostrich.getClass().getSimpleName(), 
//				ostrich.getLegs());
//		ostrich.move();
		printAnimal(ostrich);
	}
	public static void printAnimal(Animal animal) {
			System.out.printf("%s 有 %d 條腿\n", 
					animal.getClass().getSimpleName(), 
					animal.getLegs());
			animal.move();
			// 如果 animal 所指向的物件是 Bird 或 Ostrich 時
			// 請呼叫特有方法 birth()
			
	}
}
