/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 * ���� : ����Ʈ ������ ���Ͽ� ����.(���� ����)
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ���ϸ��� �Է��ϼ��� : ");
		String sfile = stdIn.next();
		
		// ���ϸ����� ��ü ����.
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i=1; i<=260; i++) {
			fos.write(i);	// ���Ͽ� ���� ����.(����)
		}
		
		fos.close();	// ��� ��Ʈ�� �ݱ�.
		
		System.out.println(sfile + " ���ϸ����� ����Ʈ ������ �����Ͽ����ϴ�.");
	}
}