package com.nacs.array.logicalProgram.main;

import com.nacs.array.logicalProgram.Sorting;

public class MainSortiing {
	public static void main(String[] args) {
//		int[] intArray = { 4, 5, 1, 3, 2};
//		System.out.println("Befor Sorting");
//		printArray(intArray);
//		
//		//BubbleSort
//		
////		Sorting.bubbleSort(intArray);
////		System.out.println();
//		
//		//SelectionSort
//		
////		Sorting.selectionSort(intArray);
////		System.out.println();
//		
//		//InsertionSort
//		
////		Sorting.insertionSort(intArray);
////		System.out.println();
//		
//		//conqure1
//		
//		
//		System.out.println("After Sorting");
//		printArray(intArray);
//		
//	}
//	
//	public static void printArray(int... array) {
//		for (int no:array)
//			System.out.println(no + " ");
    
		int[] array= {90, 20, 40, 10, 80};
		System.out.print("Before : ");
		for (int ele:array)
			System.out.print(ele +" ");
		Sorting.divide(0, array.length-1,array);
		System.out.println();
		System.out.print("After :");
		for(int ele:array)
			System.out.print(ele+ " ");
		
	}
}
