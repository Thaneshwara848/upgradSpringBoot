package com;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PIN :");
		String pin = sc.next();
		int upin=Integer.parseInt(pin);
		
		if(upin==1234) {
			System.out.println("its correct");
		}
	}
}
