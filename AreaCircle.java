package com.BasicProg.in;

import java.util.Scanner;

// area of circle is pi*R*r;
public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Area of Circle");
		System.out.println("Enter the radius");
		r =sc.nextDouble();
		
		double area = 3.14 * r * r;
		
		System.out.println("Area of Circle is = " + area);
		
		
		
		
		
	}
}
