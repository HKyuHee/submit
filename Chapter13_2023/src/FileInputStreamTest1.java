/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� ���ϸ��� �Է��ϼ��� : ");
		String sfile = stdIn.next();	// ���ڿ��� �Էµ� ���ϸ� ����.
		
		// �о���� ���ϸ����� ��ü ����.
		FileInputStream fis = new FileInputStream(sfile);
		
		// �� ����Ʈ�� �б�.
		int i;
		while((i=fis.read()) != -1) {	// �����͸� ��� ������ -1 ��ȯ.
			System.out.print((char)i);
		}
		fis.close();	// �Է� ��Ʈ�� �ݱ�.
		
		System.out.println(sfile + "���Ϸκ��� ����Ʈ�� �о� ȭ�鿡 ����Ͽ����ϴ�.");
					
	}
}