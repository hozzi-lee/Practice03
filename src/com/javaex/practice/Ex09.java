package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		
		int x, y;
		
		for ( y = 1; y < 11; y++ ) {
			for ( x = y; x < y + 10; x++ ) {
				System.out.print( x + "\t" );
			}
			System.out.println("");
		}
	}

}
