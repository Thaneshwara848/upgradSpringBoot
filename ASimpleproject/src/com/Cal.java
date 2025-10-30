package com;

public class Cal {
	public int add(int a , int b) {
		return a+b;
	}
	public int sub(int a , int b) {
		
		return a-b;
	}
	public int mul(int a , int b) {
		return a*b;
	}
	public int div(int a , int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.add(100, 200));		//	300
		System.out.println(c.sub(200, 100));		//  100
		System.out.println(c.mul(10, 20));			//	200
		System.out.println(c.div(100, 20));			//	5
	}
}
