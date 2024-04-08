package com.BasicProg.in;

import java.util.Scanner;

// To check number is even or odd 
public class EvenOdd {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int a; 
		System.out.println("Enter the Number to check weather Even or Odd");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("The given number is Even");
		}
		else {
			System.out.println("The given number is Odd");
		}
		
	}

}
