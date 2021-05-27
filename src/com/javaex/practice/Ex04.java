package com.javaex.practice;

public class Ex04 {
	public static void main(String[] args) {

		for ( int i = 1; i < 5; i++ ) { // i는 1부터 시작 5미만 까지 반복 1씩 증가 1, 2, 3, 4
			System.out.println(i); // i출력 1, 2, 3, 4
		}

		System.out.println("==============");

		for ( int i = 10; i > 0; i = i - 2 ) { // i는 10부터 시작하여 0초과 까지 반복 i-2(2)씩 감소 10, 8, 6, 4, 2 
			System.out.println(i);
		}

		/* 출력
		1
		2
		3
		4
		============
		10
		8
		6
		4
		2
		 */ // 정답!!
	}

}
