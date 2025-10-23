package com;
public class AddSub {
	public int add(int a , int b ) {
		
		return a + b; 
	}
	public int sub( int a  , int b ) {
		
		return a - b;
	}
	public int mul(int a , int b ) {
		
		return a * b; 
	}
	public int div( int a  , int b ) {
		
		return a / b;
	}
	public static void main(String[] args) {
		AddSub a = new AddSub();
		System.out.println(a.add(100, 200));	//300
		System.out.println(a.sub(200, 100));	// 100
		System.out.println(a.add(10, 20));		// 200
		System.out.println(a.div(200, 100));	// 2 
		

	}

}
