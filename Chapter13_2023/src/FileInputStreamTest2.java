/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException {
		// ���� ��ü ����.
		File file = new File("c.txt");
		
		// FileReader ��ü ����.
		FileReader fr = new FileReader(file);
		
		// �� ���ھ� �б�.
		int i;
		while((i=fr.read()) != -1) {	// �����͸� ��� ������ -1 ��ȯ.
			System.out.print((char)i);
		}
		fr.close();		// ��Ʈ�� �ݱ�.
	}
}