package com.BasicProg.in;

import java.util.Scanner;

// Area of Rectangle is l * b;
public class AreaRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double length;
		double width;
		System.out.println("Area of Rectangle");
		System.out.println("Enter the length of Rectangle");
		length = sc.nextDouble();
		System.out.println("Enter width of Rectangle");
		width = sc.nextDouble();
		
		double area = length * width;
		
		System.out.println("Area of Rectangle =" + area);
		

	}

}
