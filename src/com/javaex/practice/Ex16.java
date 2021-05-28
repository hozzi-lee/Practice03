package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		int sum = 0;
		int j = num/5;
		
		for ( int i = 1; i <= num; i++ ) {
			for ( i = 5; i <= num; i+=5 ) {
			}
			for ( i = 5; i <= num; i+=5 ) {
				sum = sum + i;
			}
			System.out.println("5의배수의 개수: " + j);
			System.out.println("5의배수의 합: " + sum);
		}




		sc.close();
	}

}
