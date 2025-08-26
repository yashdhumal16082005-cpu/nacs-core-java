package com.nacs.array.logicalProgram;

public class Search {

	private Search() {
	}

	public static int linearSearch(int target, int... array) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == target)
				return i;
		return -1;

	}
	
	public static int bainarySearch(int target, int... array) {
		int left = 0;
		int right = array.length - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (target == array[mid])
				return mid;
			if (target < array[mid])
				right = mid - 1;
			if (target > array[mid])
				left = mid + 1;
		}
		
		return target ;
		
	}
	
}
