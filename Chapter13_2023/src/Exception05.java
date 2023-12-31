/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception05 {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e + "파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}