/*
 * �ۼ��� : 2023�� 9�� 15��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 */

package Ch12;

class TestTest {
	private String text;
	public TestTest(String s) {
		this.text = s;
	}
}

public class Test2 {
	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		// System.out.println(test.text.toLowerCase());		//text�� private�� ����Ǿ��� ������ ����.
	}
}