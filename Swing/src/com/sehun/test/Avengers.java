package com.sehun.test;

public class Avengers {
	Person[] p;

	public Avengers() {
		p = new Person[4];
		p[0] = new Person("������", "����");
		p[1] = new Person("��â��", "����");
		p[2] = new Person("������", "����");
		p[3] = new Person("��μ�", "����");
	}

	public void printAvenger() {
		for (int i = 0; i < 4; i++) {
			p[i].print();
		}
	}
}
