package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.Cat;

public class MainAnimalCat {
	public static void main(String[] args) {
		Cat cat = new Cat("Very Good", 3, "Meow Meow", 'M');
		System.out.print("Night Vision : ");
		System.out.println(cat.getNightVision());
		System.out.print("Age : ");
		System.out.println(cat.getAge());
		System.out.print("Gender : ");
		System.out.println(cat.getGender());
		System.out.print("Sound : ");
		System.out.println(cat.getSound());
		
		

	}
}
