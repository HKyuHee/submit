/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception05 {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e + "������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}
}