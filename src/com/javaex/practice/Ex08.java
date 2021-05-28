package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		int dan;
		int i = 1;
		
		for ( i = 1; i < 10; i++ ) {
			for ( dan = 2; dan < 10; dan++ ) {
				System.out.print( dan + "*" + i + "=" + dan * i + "\t" );
			}
			System.out.println("");
		}
	}

}
