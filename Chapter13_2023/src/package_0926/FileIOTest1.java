/*
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 9월 26일
 */

package package_0926;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest1 {
	public static void main(String[] args) throws IOException {
		String source = "Have a good day. Hava a nice day! Have good? Have fun?";
		char intxt[] = new char[source.length()];
		// 문자열 크기의 문자배열 생성. 
		source.getChars(0, source.length(), intxt, 0);
		// 입력배열을 intxt 문자 배열에 저장.
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt);		// 문자 배열의 내용을 파일에 출력.
		
		fw.close();
	}
}