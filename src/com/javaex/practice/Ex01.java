package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println("while문"); // while --> 초기화, 반복조건, 증감식을 따로쓴다.
		int index = 0; // 초기화
		while ( index < 3 ) { // 반복조건
			System.out.println("index=" + index);
			index++; // 증감식
		} // index값을 0부터 출력, 3보다 작은수만, 출력후 1씩 증가 --> index=0, index=1, index=2

		System.out.println("for문"); // for --> 초기화, 반복조건, 증감식을 함께 쓴다.
		for ( int order = 0; order < 3; order++) {// 초기화; 반복조건; 증감식
			System.out.println("order=" + order);
		} // order값을 0부터 출력, 3보다 작은수만, 출력후 1씩 증가 --> order=0, order=1, order=2

		/* 출력
		while문
		index=0
		index=1
		index=2
		for문
		order=0
		order=1
		order=2
		 */ // 정답!!
	} 

}
