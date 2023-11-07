/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 11월 7일
 */

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String s1 = "name Hwangkh gender M age 24";
		String s2 = "name,Hwangkh,gender,M,age,24";
		String s3 = "name/Hwangkh/gender/M/age/24";
		
		// 빈칸을 기준으로 분리
		System.out.println(":: 빈칸을 기준으로 분리 ::");
		
		StringTokenizer st1 = new StringTokenizer(s1);
		
		// 토큰이 있으면 true, 없으면 false를 반환
		while (st1.hasMoreTokens()) {
			String first = st1.nextToken();		// 다음 토큰을 기준으로 문자열을 반환
			String second = st1.nextToken();
			
			System.out.println(first + "\t" + second);
		}
		
		// ","을 기준으로 분리
		System.out.println(":: ,을 기준으로 분리 ::");
		
		StringTokenizer st2 = new StringTokenizer(s2, ",");		// 분리자 : ","
		
		// 토큰이 있으면 true, 없으면 false를 반환
		while (st2.hasMoreTokens()) {
			String first = st2.nextToken();		// 다음 토큰을 기준으로 문자열을 반환
			String second = st2.nextToken();
			
			System.out.println(first + "\t" + second);
		}
		
		// "/"을 기준으로 분리
		System.out.println(":: /을 기준으로 분리 ::");
		
		StringTokenizer st3 = new StringTokenizer(s3, "/");		// 분리자 : "/"
		
		// 토큰이 있으면 true, 없으면 false를 반환
		while (st3.hasMoreTokens()) {
			String first = st3.nextToken();		// 다음 토큰을 기준으로 문자열을 반환
			String second = st3.nextToken();
			
			System.out.println(first + "\t" + second);
		}
	}
}