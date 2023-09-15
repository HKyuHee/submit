/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}
}