/*
 * 작성일 : 2023년 9월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

package Ch12;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea"));		// 현재 문자열 끝에 "korea" 첨부.
		System.out.println(sb2.append(sb1));			// 현재 문자열 끝에 sb1 첨부.
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5, 9));		// 문자열의 index[5]부터 9번 째 데이터를 string 객체로 반환.
		System.out.println(sb2.delete(5, 10));			// 문자열의 index[5]부터 10번 째 데이터를 삭제.
		System.out.println(sb2);
		System.out.println(sb1.reverse());				// 문자열을 역순의 문자열로 변환하여 반환.
	}
}