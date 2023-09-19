/*
 * 작성일 : 2023년 9월 19일
 * 작성자 : 201995103 황규희
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