/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 * 설명 : 2개의 정수를 입력 받아 나눗셈하는 프로그램.
 */

import java.util.Scanner;

public class ExceptionTest01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		System.out.println(num1 / num2);
	}
}