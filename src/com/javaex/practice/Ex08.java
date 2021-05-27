package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		int dan;
		int i = 1;
		
		for ( dan = 2; dan < 10; dan++ ) {
			for ( i = 1; i < 10; i++ ) {
				System.out.println( dan + "*" + i + "=" + dan * i );
			}
//			System.out.println("");
		}
	}

}
