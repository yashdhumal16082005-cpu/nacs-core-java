package com.nacs.oops.inheritance.subtype;

import com.nacs.oops.inheritance.supertype.Animal;

public class Cat extends Animal {
	private String nightVision;

	public Cat() {

	}

	public Cat(String NightVision, int age, String sound, char gender) {
		super(age, sound, gender);
		nightVision= NightVision;
	
	}
	public void setAge(int age) {
		if(age>0 && age<=12)
			super.setAge(age);;
	}
	

	@Override
	public String toString() {
		return "Cat [nightVision=" + nightVision + ", getNightVision()=" + getNightVision() + ", getAge()=" + getAge()
				+ ", getSound()=" + getSound() + ", getGender()=" + getGender() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getNightVision() {
		return nightVision;
	}

	public void setNightVision(String nightVision) {
		this.nightVision = nightVision;
	}

	public Cat(String nightVision) {
		super();
		this.nightVision = nightVision;
	}

	public Cat(int age, String sound, char gender) {
		super(age, sound, gender);
	
	}
}
