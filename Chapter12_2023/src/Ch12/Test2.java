/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
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
		// System.out.println(test.text.toLowerCase());		//text가 private로 선언되었기 때문에 오류.
	}
}