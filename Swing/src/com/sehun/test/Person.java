package com.sehun.test;

public class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String print() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// get set메소드를 자동완성하려면 alt + shift + s를 누르고 generate getter setter를 누른다음 get set메소드를 만들 변수를 택하면
	// 자동완성이 된다.

}
