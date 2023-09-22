/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 201995103	황규희
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2_1 {

	public static void main(String[] args) {
		try {
			// FileInputStream 객체 생성.
			File file = new File("c.txt");
			
			FileInputStream fr = new FileInputStream(file);
			
			// 한 문자씩 읽기.
			int i;
			while((i=fr.read()) != -1) {	// 데이터를 모두 읽으면 -1 반환.
				System.out.print((char)i);
			}
			fr.close();		// 스트림 닫기.
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		catch (IOException e) {
			System.out.println("읽어들일 파일이 없습니다.");
		}
	}

}
