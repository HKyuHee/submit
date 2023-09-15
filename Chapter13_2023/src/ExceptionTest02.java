/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 * 설명 : 2개의 정수를 입력 받아 나눗셈하는 프로그램.
 */

import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println(num1 / num2);		// 예외 처리 단축기 : alt + shift + z
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("해당 예외 : " + e);
			// e.printStackTrace();
		}
	}
}