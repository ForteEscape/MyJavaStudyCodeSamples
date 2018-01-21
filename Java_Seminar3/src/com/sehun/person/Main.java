package com.sehun.person;

public class Main{
	public static void main(String[] args) {
		
		Person sehunkim = new Person(){
			
			@Override
			public void run() {
				System.out.println("ÀßÀá");
			}

			@Override
			public void sleep() {
				System.out.println("µÎÄ­¾¿ ¶Ü");
			}

			@Override
			public void eat() {
				System.out.println("°í±â¸¸ ¸ÔÀ½");
			}
		};
		
		sehunkim.run();
		sehunkim.eatChicken();
		Person.breath();
		
		System.out.println(sehunkim instanceof Person);
		System.out.println(sehunkim instanceof Object);
	}

}
