package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {

		int x, y;
		for ( x = 0; x < 4; x++ ) { // x는 0부터 시작 4미만 까지 반복 1씩 증가 0, 1, 2, 3
			for ( y = 2; y >= 0; y-- ) { // y는 2부터 시작 0이상 까지 반복 1씩 감소 2, 1, 0
				System.out.print("*");
			}
			System.out.println("");
		}

		/* 출력
		 ***
		 ***
		 ***
		 ***
		 */ // 정답!!
	}

}
