package com.nano.Tutorials.Misc;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
			try{
				System.out.println("enter first num");
				int num1 = input.nextInt();
				System.out.println("enter second num");
				int num2 = input.nextInt();
				int answer = num1/num2;
				System.out.println(answer);
				//x = 2;
			}catch(Exception e){
				System.out.println("you cant do that");
				// or x = 2;
			}
		}while(x == 1);
		
		
	}

}
