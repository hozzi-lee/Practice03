package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int y;
		int x;
//		int z;

		for ( y = 0; y < num; y++ ) {
			for ( x = y; x < num; x++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for ( y = 1; y < num; y++ ) {
			for ( x = num - y; x <= num; x++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
