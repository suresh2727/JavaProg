package com.PatternMatching.in;
// change in number is not possilbe with i and j so we use n=9 to print the numbers by decriment
public class NumberSequanceInReverse {
	public static void main(String[] args) {
		int n=9;
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=3 ; j++) {
				System.out.print(n + " ");
				n--;
			}
			System.out.println(" ");
		}
	}
}
