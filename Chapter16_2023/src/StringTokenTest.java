/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 11�� 7��
 */

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String s1 = "name Hwangkh gender M age 24";
		String s2 = "name,Hwangkh,gender,M,age,24";
		String s3 = "name/Hwangkh/gender/M/age/24";
		
		// ��ĭ�� �������� �и�
		System.out.println(":: ��ĭ�� �������� �и� ::");
		
		StringTokenizer st1 = new StringTokenizer(s1);
		
		// ��ū�� ������ true, ������ false�� ��ȯ
		while (st1.hasMoreTokens()) {
			String first = st1.nextToken();		// ���� ��ū�� �������� ���ڿ��� ��ȯ
			String second = st1.nextToken();
			
			System.out.println(first + "\t" + second);
		}
		
		// ","�� �������� �и�
		System.out.println(":: ,�� �������� �и� ::");
		
		StringTokenizer st2 = new StringTokenizer(s2, ",");		// �и��� : ","
		
		// ��ū�� ������ true, ������ false�� ��ȯ
		while (st2.hasMoreTokens()) {
			String first = st2.nextToken();		// ���� ��ū�� �������� ���ڿ��� ��ȯ
			String second = st2.nextToken();
			
			System.out.println(first + "\t" + second);
		}
		
		// "/"�� �������� �и�
		System.out.println(":: /�� �������� �и� ::");
		
		StringTokenizer st3 = new StringTokenizer(s3, "/");		// �и��� : "/"
		
		// ��ū�� ������ true, ������ false�� ��ȯ
		while (st3.hasMoreTokens()) {
			String first = st3.nextToken();		// ���� ��ū�� �������� ���ڿ��� ��ȯ
			String second = st3.nextToken();
			
			System.out.println(first + "\t" + second);
		}
	}
}