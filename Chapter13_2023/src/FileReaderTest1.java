/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 * ���� : ���Ͽ� ����� ���� ��������.(���)
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("���� ���ϸ��� �Է��ϼ��� : ");
			String sfile = stdIn.next();	// ���ڿ��� �Էµ� ���ϸ� ����.
			
			// �о���� ���ϸ����� ��ü ����.
			FileReader fr = new FileReader(sfile);
			// �� ���ھ� �б�.
			int i;
			while((i=fr.read()) != -1) {	// �����͸� ��� ������ -1 ��ȯ.
				System.out.print((char)i);
			}
			fr.close();		// ��Ʈ�� �ݱ�.
		}
		catch (FileNotFoundException e) {	// ���� ó�� �ʼ�.
			System.out.println("������ �����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("�о���� ������ �����ϴ�.");
		}
	}
}