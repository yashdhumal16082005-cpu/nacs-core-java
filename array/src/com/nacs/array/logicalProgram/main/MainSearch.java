package com.nacs.array.logicalProgram.main;

import java.util.Scanner;

import com.nacs.array.logicalProgram.Search;

public class MainSearch {
	public static void main(String[] args) {
		
	//	System.out.println(Search.linearSearch(9,3,4,5,6,2));
		
	//	System.out.println(Search.bainarySearch(50,20,30,40,50,60));
		System.out.println("Enter the Element You Want To Search ");
		Scanner scanner=new Scanner(System.in);
		int target=scanner.nextInt();
		System.out.println("Given Element Found At :-  " +Search.bainarySearch(target) );
		
		
	}
}
