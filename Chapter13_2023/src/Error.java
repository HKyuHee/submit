/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

public class Error {
	public static void main(String[] args) {
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		z();
	}
	static void z() {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
}