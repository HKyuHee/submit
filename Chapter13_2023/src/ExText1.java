/*
 * �ۼ��� : 2023�� 9�� 19��
 * �ۼ��� : 201995103 Ȳ����
 */

public class ExText1 {
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		}
		catch (NumberFormatException nfe) {
			f = 0;
		}
		finally {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
		parse("korea");
	}
}