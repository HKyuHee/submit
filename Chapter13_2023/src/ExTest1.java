/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 201995103 황규희
 */

public class ExTest1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			System.out.print("2/0은 : ");
			int div = b / a;
			System.out.println(div);
		}
		catch (RuntimeException ex) {
			System.out.println("RuntimeException 예외 발생");
		}
		catch (Exception ex) {
			System.out.println("Exception 예외 발생");
		}
	}
}