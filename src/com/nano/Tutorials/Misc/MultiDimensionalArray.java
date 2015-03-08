package com.nano.Tutorials.Misc;

public class MultiDimensionalArray {
	public static void main(String[] args){
		int bucky[][]= {{1,2,3,4},
				{5,6,7,8}, {9,10,11,12}};
		int bucky2[][] = {{44,55,66},{77,88,90}};
		
		System.out.println("This is the first array.");
		display(bucky);
		
		System.out.println("This is the second array.");
		display(bucky2);
	}
	
	public static void display(int x[][]){
		for(int row = 0; row <x.length; row++){
			for(int column = 0; column<x[row].length; column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
