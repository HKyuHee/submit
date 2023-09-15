/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

public class Error {
	public static void main(String[] args) {
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		z();
	}
	static void z() {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
}