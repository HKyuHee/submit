/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 11�� 7��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener {
	// �ζ� ��ȣ ��� �� �� ����
	private JLabel lotto_num = new JLabel();
	
	// ������
	public Lotto() {
		// �����̳� ����
		Container ct = getContentPane();
		
		// ���̾ƿ� ���� - FlowLayout
		ct.setLayout(new FlowLayout());
		
		// ��ư ��ü ����
		JButton lotto = new JButton("�ζ� ��ȣ �ڵ�����");
		
		// �����̳ʿ� ��ư�� �� �߰�
		ct.add(lotto);
		ct.add(lotto_num);
		
		// ��ư�� �̺�Ʈ ������ �߰�
		lotto.addActionListener(this);
		
		// ȭ�鿡 ���̱�
		setTitle("Lotto Number Generate");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rnd_num = new Random();		// Random() Ŭ������ ��ü ����
		int[] lotto_number = new int[6];	// �迭 ����
		
		// ���� ��ȣ�� �ִ��� Ȯ���ϱ� ���� ���� ����
		int temp;
		int i = 0;
		
		a: while(i < 6) {
			// ���� ��ȣ ����
			temp = rnd_num.nextInt(45)+1;
			
			// �迭�� ����� ���� temp�� ����� ���� ���Ͽ� ������ �ٽ� ���� �� �߻�
			for (int j=0; j <= i; j++) {
				if (temp == lotto_number[j]) {
					continue a;
				}
			}
			
			// temp �� �迭�� ����.
			lotto_number[i] = temp;
			i++;
		}
		
		lotto_num.setText("�̹� �� �ζ� ��÷��ȣ : " + Arrays.toString(lotto_number));
	}
}

public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}