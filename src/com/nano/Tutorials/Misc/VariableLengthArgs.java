package com.nano.Tutorials.Misc;

public class VariableLengthArgs {
	public static void main(String[] args){
		System.out.println(average(1,2,3,5,6,8,66,32,0));
		
	}
	public static int average(int...numbers){
		int total = 0;
		for(int x : numbers){
			total += x;
		}
		
		return total/numbers.length;
		
	}
}
