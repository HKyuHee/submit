/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2_1 {

	public static void main(String[] args) {
		try {
			// FileInputStream ��ü ����.
			File file = new File("c.txt");
			
			FileInputStream fr = new FileInputStream(file);
			
			// �� ���ھ� �б�.
			int i;
			while((i=fr.read()) != -1) {	// �����͸� ��� ������ -1 ��ȯ.
				System.out.print((char)i);
			}
			fr.close();		// ��Ʈ�� �ݱ�.
		}
		catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("�о���� ������ �����ϴ�.");
		}
	}

}
