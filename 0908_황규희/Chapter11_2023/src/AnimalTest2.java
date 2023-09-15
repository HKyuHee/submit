/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터소프트웨어공학부 201995103 황규희
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하자.
 * 		클래스 메소드
 */

// 추상 클래스 - 동물
abstract class myAnimal2 {
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	/* abstract String sound() {		// 추상 메소드는 본문을 지정하지 않음.
		
	} */
	abstract String sound2();
	
	// 클래스 메소드 : 동물의 기본 정보를 출력하는 메소드
	static void displayInfo2() {
		System.out.println("동물의 울음소리입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
// 고양이 울음소리 반환
class myCat2 extends myAnimal2 {
	@Override
	String sound2() {
		// 재정의.
		return "야옹~~";
	}

	
	static void displayInfo2() {	// 클래스(정적) 메소드는 오버라이딩 되지 않음.
		System.out.println("고양이 울음소리입니다.");
	}
}

public class AnimalTest2 {
	public static void main(String[] args) {
		myAnimal2 cat = new myCat2();
		
		cat.displayInfo2();
		System.out.println(cat.sound2());
	}
}