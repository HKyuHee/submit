/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

// 단축 초기화 과정으로 생성된 문자열들은 같은 값을 가지는 경우에 같은 기억 장소에 저장됨.
// 정상적인 과정으로 생성된 문자열은 다른 메모리에 따로 저장됨.

package Ch12;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "Java Korea";	// 단축 초기화 문자열로 생성
		String s2 = new String("Java Korea");
		String s3 = s2.intern();	// 단축 초기화 문자열로 바꾸어 주는  메소드
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		
		System.out.println("s1과 s2가 같은 장소 ? " + (s1 == s2));
		System.out.println("s1과 s2의 값이 같은가? : " + (s1.equals(s2)));
		System.out.println("s1과 s3가 같은 장소? : " + (s1 == s3));
		System.out.println("s2와 s5가 같은 장소? : " + (s2 == s5));
		System.out.println("s2와 s5의 값이 같은가? : " + (s2.equals(s5)));
	}
}