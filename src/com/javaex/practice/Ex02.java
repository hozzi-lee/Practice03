package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {

		int x, y;
		for ( x = 0; x < 4; x++) { // x는 0부터 시작하여 4미만 까지 반복 1씩 증가 0, 1, 2, 3
			for ( y = 2; y > 0; y--) { // y는 2부터 시작하여 0초과 까지 반복 1씩 감소 2, 1
				System.out.print("*");
			}
			System.out.println("");
		}
		/* 출력
		 **
		 **
		 **
		 **
		 */ // 정답!!
	}

}
