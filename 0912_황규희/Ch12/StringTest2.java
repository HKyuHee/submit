/*
 * �ۼ��� : 2023�� 9�� 12��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

// ���� �ʱ�ȭ �������� ������ ���ڿ����� ���� ���� ������ ��쿡 ���� ��� ��ҿ� �����.
// �������� �������� ������ ���ڿ��� �ٸ� �޸𸮿� ���� �����.

package Ch12;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "Java Korea";	// ���� �ʱ�ȭ ���ڿ��� ����
		String s2 = new String("Java Korea");
		String s3 = s2.intern();	// ���� �ʱ�ȭ ���ڿ��� �ٲپ� �ִ�  �޼ҵ�
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		
		System.out.println("s1�� s2�� ���� ��� ? " + (s1 == s2));
		System.out.println("s1�� s2�� ���� ������? : " + (s1.equals(s2)));
		System.out.println("s1�� s3�� ���� ���? : " + (s1 == s3));
		System.out.println("s2�� s5�� ���� ���? : " + (s2 == s5));
		System.out.println("s2�� s5�� ���� ������? : " + (s2.equals(s5)));
	}
}