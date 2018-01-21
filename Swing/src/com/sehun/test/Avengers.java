package com.sehun.test;

public class Avengers {
	Person[] p;

	public Avengers() {
		p = new Person[4];
		p[0] = new Person("이현영", "여자");
		p[1] = new Person("강창훈", "남자");
		p[2] = new Person("임진하", "여자");
		p[3] = new Person("김두수", "남자");
	}

	public void printAvenger() {
		for (int i = 0; i < 4; i++) {
			p[i].print();
		}
	}
}
