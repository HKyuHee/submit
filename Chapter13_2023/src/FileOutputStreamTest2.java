/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 * ���� : ����Ʈ ������ ���Ͽ� ����.(���� ����)
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		// ���ϸ����� ��ü ����.
		OutputStream fos = new FileOutputStream("c.txt");
		// OutputStream : ����Ʈ ��Ʈ���� ������� ���� �߻� Ŭ����.
		// FileOutputStream : ���Ͽ� ����Ʈ ��Ʈ���� ����� ��� ����.
		
		String str = "�ڹ� ���α׷��� \n���� ��Ʈ���� ����Ʈ ��Ʈ�� \n";
		
		byte[]bt = str.getBytes();	// ���ڿ��� ����Ʈ�� ��ȯ.
		
		fos.write(bt);	// ���Ͽ� ����.(����)
		System.out.println("������ �����Ͽ����ϴ�.");
		fos.close();	// ��� ��Ʈ�� �ݱ�.
	}
}