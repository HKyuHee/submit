/*
 * �ۼ��� : 2023�� 9�� 22��
 * �ۼ��� : 201995103	Ȳ����
 * ���� : ���ڸ� ���Ͽ� ����.(����)
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ���ϸ��� �Է��ϼ��� : ");
		String sfile = stdIn.next();
		
		// ���Ͽ� ������ ���ڿ� ����.
		String source = "��� �־�� ��μ� ���������� ���\n" + " ������ ����Ѵٴ� ����\n" +
		" ����� �������� ��ħ�� �´´ٴ� ���Դϴ�.\n";
		
		// ���ϸ����� ��ü ����.
		FileWriter fw = new FileWriter(sfile);
		
		// ���ڿ��� ���Ͽ� ���.
		fw.write(source);		// ��ü�� ���� a.txt ���Ͽ� source�� �ִ� ������ ���(����)
		
		// ��� ��Ʈ�� �ݱ�.
		fw.close();
		
		System.out.println("������ �����Ǿ����ϴ�.");
	}
}