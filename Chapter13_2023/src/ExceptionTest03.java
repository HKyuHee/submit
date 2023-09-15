/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 * ���� : 2���� ������ �Է� �޾� �������ϴ� ���α׷�.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է� : ");
		int num1 = Integer.parseInt(stdIn.next());		// ���ڸ� �Է� �޾� ���������� ��ȯ.
		System.out.print("�� ��° �� �Է� : ");
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println(num1 / num2);			// ���� ó�� ����� : alt + shift + z
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			// System.out.println("�ش� ���� : " + e);
			// e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("ù ��° ���� ���ڸ� �Է��Ͻÿ�.");
		} catch (InputMismatchException e) {
			System.out.println("�� ��° ���� ���ڸ� �Է��Ͻÿ�.");
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} finally {		// ���� ����.
			System.out.println("���α׷� ����.");
		}
	}
}