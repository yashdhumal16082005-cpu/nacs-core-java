package com.nacs.oops.inheritance.supertype;

public class Animal {
	private int age ;
	private String sound;
	private char gender;

	public Animal() {
		System.out.println("This is Animal Constructor..");
	}

	public Animal(int age, String sound, char gender) {
		super();
		this.age = age;
		this.sound = sound;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
