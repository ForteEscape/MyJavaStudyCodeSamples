package com.sehun.person;

public interface Person {
	
	int foot = 2;
	int hand = 2;
	int mouth = 1;
	int eye = 2;
	
	public abstract void run();
	public void sleep();
	void eat();
	
	static void breath() {
		System.out.println("살기 위해 숨쉬는중");
	}
	
	default void eatChicken() {
		System.out.println("치킨 맛있다.");
	}

}
