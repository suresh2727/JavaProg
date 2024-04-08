package com.BasicProg.in;

import java.util.Scanner;

public class CalcSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.Add 2.Sub 3.Mul 4.Divide");
		int ch;
		ch =sc.nextInt();
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2st number");
		int b=sc.nextInt();
		
		int ans;
		
		switch(ch) {
		case 1 : ans = a+b;
				 System.out.println("Addition = "+ ans );
				 break;
		case 2: ans = a-b;
				System.out.println("Substraction = " +ans);
				break;
		case 3: ans = a*b;
		System.out.println("Multiplication = " +ans);
		break;
		
		case 4: ans = a%b;
		System.out.println("Division = " +ans);
		break;
		
		default : System.out.println("Invalid Choice");
		 }
		 
		
	}
}
