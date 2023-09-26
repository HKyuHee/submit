/*
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 9�� 26��
 */

package package_0926;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectRead01 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Է� ���ϸ��� �Է��ϼ��� : ");
		String fileName = stdin.next();
		
		// ��ü�� ���� �� �ִ� ObjectInputStream ��ü ����.
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		
		// ����ȭ�� ��ü �о� ����.
		Object s2 = ois.readObject();
		
		// readObject() �޼ҵ�� ����ȭ�� ��ü�� 2�� �����͸� �о ��ü Ÿ������ ĳ����(�� ��ȯ)�Ѵ�.
		PersonInfo p1 = (PersonInfo)ois.readObject();
		PersonInfo p2 = (PersonInfo)ois.readObject();
		
		// ����� ������� �Է��ؾ� �Ѵ�.
		System.out.println(s2);
		System.out.println("�̸� : " + p1.name);
		System.out.println("�ּ� : " + p1.city);
		System.out.println("���� : " + p1.age);
		System.out.println("------------------");
		System.out.println("�̸� : " + p2.name);
		System.out.println("�ּ� : " + p2.city);
		System.out.println("���� : " + p2.age);
	}
}