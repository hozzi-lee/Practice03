package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		System.out.println("----------------------------------");		

		int choice;
		int money;
		int sum = 0;

		while ( true ) {
			System.out.print("선택>");
			choice = sc.nextInt();

			if ( choice == 1 ) {
				System.out.print("예금액>");
				money = sc.nextInt();
				sum = sum + money;
				continue;
			} else if ( choice == 2 ) {
				System.out.print("출금액>");
				money = sc.nextInt();
				sum = sum - money;
				continue;
			} else if ( choice == 3 ) {
				System.out.print("잔고액>");
				System.out.println(sum);
				continue;
			} else if ( choice == 4 ) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해 주세요");
				continue;
			}
		} 
		sc.close();
	}

}
