/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 201995103	황규희
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("읽을 파일명을 입력하세요 : ");
		String sfile = stdIn.next();	// 문자열로 입력된 파일명 저장.
		
		// 읽어들일 파일명으로 객체 생성.
		FileInputStream fis = new FileInputStream(sfile);
		
		// 한 바이트씩 읽기.
		int i;
		while((i=fis.read()) != -1) {	// 데이터를 모두 읽으면 -1 반환.
			System.out.println(i);
		}
		fis.close();	// 입력 스트림 닫기.
		
		System.out.println(sfile + "파일로부터 바이트를 읽어 화면에 출력하였습니다.");
					
	}
}
