/*
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 9�� 26��
 */

package package_0926;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest1 {
	public static void main(String[] args) throws IOException {
		String source = "Have a good day. Hava a nice day! Have good? Have fun?";
		char intxt[] = new char[source.length()];
		// ���ڿ� ũ���� ���ڹ迭 ����. 
		source.getChars(0, source.length(), intxt, 0);
		// �Է¹迭�� intxt ���� �迭�� ����.
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt);		// ���� �迭�� ������ ���Ͽ� ���.
		
		fw.close();
	}
}