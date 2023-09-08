/*
 * �ۼ��� : 2023�� 9�� 8��
 * �ۼ��� : ��ǻ�ͼ���Ʈ������к� 201995103 Ȳ����
 * ���� : �߻�Ŭ���� - ������ �����Ҹ��� �������.
 */

// �߻� Ŭ���� - ����
abstract class myAnimal {
	// �߻� �޼ҵ� : ������ �Ҹ��� ��ȯ�ϴ� �޼ҵ�
	/* abstract String sound() {		// �߻� �޼ҵ�� ������ �������� ����.
		
	} */
	abstract String sound();
	
	// �Ϲ� �޼ҵ� : ������ �⺻ ������ ����ϴ� �޼ҵ�
	void displayInfo() {
		System.out.println("������ �����Ҹ��Դϴ�.");
	}
}

// ����� Ŭ���� - �߻� Ŭ���� ���
// ����� �����Ҹ� ��ȯ
class myCat extends myAnimal {
	@Override
	String sound() {
		// ������.
		return "�߿�~~";
	}

	@Override
	void displayInfo() {
		System.out.println("����� �����Ҹ��Դϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		System.out.println(cat.sound());
	}
}