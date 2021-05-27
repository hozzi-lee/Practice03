package com.javaex.practice;

public class Ex05 {
	public static void main(String[] args) {

		int i = 1;
		boolean flag = true;

		while ( flag ) { // while의 조건문이 true일때는 무한반복 false 또는 break가 나올 때 까지.
			if ( i > 5 ) { // i가 5초과 일때 while의 조건문(flag)이 flase --> 가장 가까운 반복문(while)을 나간다. 
				flag = false;
			} // i는 1부터 시작하여 5초과 가 되면 멈춘다. 1, 2, 3, 4, 5
			System.out.println(i);
			i = i + 1; // i는 i+1(1)씩 증가.
		}
		/* 출력
		1
		2
		3
		4
		5
		 */ // 틀림: 6까지 출력되야 하는데 왜지
	}

}
