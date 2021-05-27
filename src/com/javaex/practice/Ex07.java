package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i, i2;

		for ( i = 1; i <= num; i++ ) {
			for ( i2 = 1; i2 <= i; i2++ ) {
				System.out.print( i );
			}
			System.out.println("");
		}


		sc.close();
	}

}
