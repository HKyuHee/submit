/*
 * �ۼ��� : 2023�� 9�� 19��
 * �ۼ��� : 201995103 Ȳ����
 * ���̸� �Է¹޾� ����Ͻÿ�.
 * �Է¹��� ���̰� ������ �ƴ� ��� ����ó�� �Ͻÿ�.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int age = 0;
		try	{
			age = stdIn.nextInt();
			System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		}
		catch(InputMismatchException e) {
			System.out.print("���̴� ������ �Է��ϼ���.");
		}
	}
}