/*
 * �ۼ��� : 2023�� 9�� 19��
 * �ۼ��� : 201995103 Ȳ����
 */

public class ExTest1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			System.out.print("2/0�� : ");
			int div = b / a;
			System.out.println(div);
		}
		catch (RuntimeException ex) {
			System.out.println("RuntimeException ���� �߻�");
		}
		catch (Exception ex) {
			System.out.println("Exception ���� �߻�");
		}
	}
}