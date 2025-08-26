package com.nacs.array.logicalProgram;


public class ArrayRotate {

	public ArrayRotate() {
		
	}

	public static void rotateLeft(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = temp;
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + "  ");

	}

	public static void rotateRight(int[] array) {
		int temp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = temp;
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + "  ");

	}
	
	
	public static void rotateToLeft(int[]array) {
int temp = 0;
		
		array[array.length - 1] = temp ;
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + "  ");

	}

	public static void rotateToRight(int[] array) {
		int temp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = temp;
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + "  ");

	}
}
