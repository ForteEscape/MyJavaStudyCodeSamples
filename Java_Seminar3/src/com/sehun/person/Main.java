package com.sehun.person;

public class Main{
	public static void main(String[] args) {
		
		Person sehunkim = new Person(){
			
			@Override
			public void run() {
				System.out.println("����");
			}

			@Override
			public void sleep() {
				System.out.println("��ĭ�� ��");
			}

			@Override
			public void eat() {
				System.out.println("��⸸ ����");
			}
		};
		
		sehunkim.run();
		sehunkim.eatChicken();
		Person.breath();
		
		System.out.println(sehunkim instanceof Person);
		System.out.println(sehunkim instanceof Object);
	}

}
