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
		System.out.println("��� ���� ��������");
	}
	
	default void eatChicken() {
		System.out.println("ġŲ ���ִ�.");
	}

}
