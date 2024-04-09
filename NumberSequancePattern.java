package com.PatternMatching.in;
// i is row and j is column but we want in number which not possible with i and j so we have to use extra varible n 
// 
public class NumberSequancePattern {
	public static void main(String[] args) {
		int n=1;
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=3 ; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println(" ");
		}
	}
}
