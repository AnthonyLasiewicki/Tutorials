package com.nano.Tutorials.Misc;

public class TimeMain {
	public static void main(String[] args){
		TimeClass time = new TimeClass();
		System.out.println(time.toMilitary());
		System.out.println(time.toNormal());
		
		time.setTime(13, 27, 6);
		System.out.println(time.toMilitary());
		System.out.println(time.toNormal());
	}
}
