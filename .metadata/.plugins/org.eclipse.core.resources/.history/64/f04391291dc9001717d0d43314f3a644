package com.sehun.problem3;

public class Person {
	public String name;
	public String gender;
	public String age;
	
	public String[] nameArray;
	public String[] genderArray;
	public String[] ageArray;
	
	int nameArrayIdx = 0;
	int genderArrayIdx = 0;
	int ageArrayIdx = 0;
	
	int nameArraySearch = -1;
	int genderArraySearch = -1;
	int ageArraySearch = -1;
	
	
	Person(){
		
	}
	
	Person(String name, String gender, String age){
		
	}
	
	void setname(String name) {
		this.nameArray[nameArrayIdx] = name;
		
		nameArrayIdx++;
	}
	
	void setgender(String gender) {
		this.genderArray[genderArrayIdx] = gender;
		
		genderArrayIdx++;
	}
	
	void setage(String age) {
		this.ageArray[ageArrayIdx] = age;
		
		ageArrayIdx++;
	}
	
	public String returnName() {
		nameArraySearch++;
		
		return nameArray[nameArraySearch];
	}
	
	public String returnGender() {
		genderArraySearch++;
		
		return nameArray[nameArraySearch];
	}
	
	public String returnAge() {
		ageArraySearch++;
		
		return ageArray[ageArraySearch];
	}
}
