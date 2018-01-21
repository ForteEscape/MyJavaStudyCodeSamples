package com.sehun.main;

public class Admin extends Member {
	private String rank;

	public Admin(String name, String gender, int age, String rank) {
		super(name, gender, age);
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	
	public String toString() {
		return "Admin[name=" + super.name +", gender=" + this.gender+", age=" + age + ", rank=" + rank + "]";
	}

}
