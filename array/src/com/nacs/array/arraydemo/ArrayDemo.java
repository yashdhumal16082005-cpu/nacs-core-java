package com.nacs.array.arraydemo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		int sub[] = new int[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < sub.length; i++) {
			System.out.println("Enter sub marks " + (i + 1));
			sub[i] =  scanner.nextInt();
			
		}
		
		int totalSum = 0;
		for (int i = 0; i < sub.length; i++) {
			totalSum = totalSum + sub[i];

			
		}
		double average =(double)totalSum / sub.length;
		System.out.println("Total marks = " + totalSum);
		System.out.println("Average marks = " + average);
		scanner.close();
	}

}
