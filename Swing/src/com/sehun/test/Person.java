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
	
	// get set�޼ҵ带 �ڵ��ϼ��Ϸ��� alt + shift + s�� ������ generate getter setter�� �������� get set�޼ҵ带 ���� ������ ���ϸ�
	// �ڵ��ϼ��� �ȴ�.

}
