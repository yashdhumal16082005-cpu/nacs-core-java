package com.nacs.array.logicalProgram;

import com.nacs.array.logicalProgram.ArrayRotate;

public class MainArrayRotate {
	public static void main(String[] args) {
		int[]array = new int[] {10, 20, 30, 40, 50, 60};
		
		System.out.println("10, 20, 30, 40, 50, 60");
		System.out.println("Rotate Left");
		ArrayRotate.rotateLeft(new int[] {10, 20, 30, 40, 50, 60});
		
		System.out.println("\n");
		System.out.println("10, 20, 30, 40, 50, 60");
		System.out.println("Rorate Right");
		
		ArrayRotate.rotateRight(new int[] {10, 20, 30, 40, 50, 60});
		
		System.out.println("\n");
		System.out.println("10, 20, 30, 40, 50, 60");
		System.out.println("Rorate To Left");
		
		ArrayRotate.rotateToLeft(new int[] {10, 20, 30, 40, 50, 60});
		
		System.out.println("\n");
		System.out.println("Rorate To Right");
		System.out.println("10, 20, 30, 40, 50, 60");
		
		ArrayRotate.rotateToRight(new int[] {10, 20, 30, 40, 50, 60});
		
		
	}
}
