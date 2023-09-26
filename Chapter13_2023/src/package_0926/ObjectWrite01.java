/*
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 9�� 26��
 */

package package_0926;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

// �� Ŭ������ ����ȭ�� ������ ����.
class PersonInfo implements Serializable {		// implements : ���
	// �������.
	String name;
	String city;
	int age;
	
	// ������.
	public PersonInfo(String name, String city, int age) {
		// �Ű������� ���޹��� ���� ��������� ����.
		this.name = name;
		this.city = city;
		this.age = age;
	}
}

public class ObjectWrite01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("��� ���ϸ��� �Է��ϼ��� : ");
		String fileName = stdin.next();
		
		String s1 = "***�� ����***";
		
		// ����ȭ�� ��ü�� 2�� ����.
		PersonInfo p1 = new PersonInfo("Ȳ����", "�λ�", 25);
		PersonInfo p2 = new PersonInfo("ȫ�浿", "����", 20);
		
		// ����ȭ�� ��ü�� 2������ ����� ������ ����.
		// ��ü�� ����� �� �ִ� ObjectOutputStream ��ü ����.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		// ����ȭ�� ��ü�� ���Ͽ� 2������ ����Ѵ�.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + " ���ϸ����� ��ü ������ �����Ͽ����ϴ�.");
	}
}