/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

package Ch12;

public class WrapTest1 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(1) + Integer.valueOf(2);
		switch(i) {
			case 3 :
				System.out.println("three");
				break;
			default :
				System.out.println("other");
				break;
		}
	}
}