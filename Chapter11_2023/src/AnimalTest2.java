/*
 * �ۼ��� : 2023�� 9�� 8��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 * ���� : �߻�Ŭ���� - ������ �����Ҹ��� �������.
 * 		Ŭ���� �޼ҵ�
 */

// �߻� Ŭ���� - ����
abstract class myAnimal2 {
	// �߻� �޼ҵ� : ������ �Ҹ��� ��ȯ�ϴ� �޼ҵ�
	/* abstract String sound() {		// �߻� �޼ҵ�� ������ �������� ����.
		
	} */
	abstract String sound2();
	
	// Ŭ���� �޼ҵ� : ������ �⺻ ������ ����ϴ� �޼ҵ�
	static void displayInfo2() {
		System.out.println("������ �����Ҹ��Դϴ�.");
	}
}

// ����� Ŭ���� - �߻� Ŭ���� ���
// ����� �����Ҹ� ��ȯ
class myCat2 extends myAnimal2 {
	@Override
	String sound2() {
		// ������.
		return "�߿�~~";
	}

	
	static void displayInfo2() {	// Ŭ����(����) �޼ҵ�� �������̵� ���� ����.
		System.out.println("����� �����Ҹ��Դϴ�.");
	}
}

public class AnimalTest2 {
	public static void main(String[] args) {
		myAnimal2 cat = new myCat2();
		
		cat.displayInfo2();
		System.out.println(cat.sound2());
	}
}