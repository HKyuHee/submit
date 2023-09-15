/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 */

package b_package;
import a_package.Test1;
// import a_package.*;

public class Test2 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.sum(10, 20));
	}
}
