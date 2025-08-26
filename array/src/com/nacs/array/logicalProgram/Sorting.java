package com.nacs.array.logicalProgram;

public class Sorting {
	//BubbleSort
	public static void bubbleSort(int... array) {
		int temp;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}
	//SelectionSort
	public static void selectionSort(int... array) {

		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;

			for (int j = i + 1; j < array.length; j++)
				if (array[minIndex] > array[j])
					minIndex = j;

			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}

	}
	//InsertionSort
	public static void insertionSort(int... array) {
		int key;
		int j;
		for (int i = 1; i < array.length; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;

			}
			array[j + 1] = key;
		}
	}
	
	public static void divide(int left, int right, int... array) {
		if(left<right) {
			int mid=(left+right)/2;
			divide(left,mid,array);
			divide(mid+1,right,array);
			conqure1(left,mid,right,array);
		}
			
		
	}
	
	public static void conqure1(int left,int right,int mid,int...array) {
		int fArraySize=mid-left+1;
		int sArraySize=right-mid;
		int[]firstArray=new int[fArraySize];
		int[]secondArray=new int[sArraySize];
		
		for(int i=0;i<firstArray.length;i++)
			firstArray[i]=array[left+i];
		for(int j=0;j<secondArray.length;j++)
			secondArray[j]=array[mid+1+j];
				
	int f=0;
	int s=0;
	int r=left;
	
	while(f<fArraySize && s<sArraySize)
		if(firstArray[f]<secondArray[s])
			array[r++]=firstArray[f++];
		else 
			array[r++]=secondArray[s++];
	
	while(f<fArraySize)
		array[r++]=firstArray[f++];
	while(s<sArraySize)
		array[r++]=secondArray[s++];
	
			
	}

}