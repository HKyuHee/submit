/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

package Ch12;

public class WrapTest1 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(1) + Integer.valueOf(2);
		switch(i) {
			case 3 :
				System.out.println("three");
				break;
			default :
				System.out.println("other");
				break;
		}
	}
}