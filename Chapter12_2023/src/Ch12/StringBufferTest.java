/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

package Ch12;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));		// ���� ���ڿ� ���� "korea" ÷��.
		System.out.println(sb2.append(sb1));			// ���� ���ڿ� ���� sb1 ÷��.
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5, 9));		// ���ڿ��� index[5]���� 9�� ° �����͸� string ��ü�� ��ȯ.
		System.out.println(sb2.delete(5, 10));			// ���ڿ��� index[5]���� 10�� ° �����͸� ����.
		System.out.println(sb2);
		System.out.println(sb1.reverse());				// ���ڿ��� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ.
	}
}