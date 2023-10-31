/*
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 31��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class JComboBox1 extends JFrame implements ItemListener {
	JLabel fruitLabel;		// �̹����� ǥ�õ� ����
	
	public JComboBox1() {
		// �޺��ڽ� ��ü ����
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		// �̹��� ǥ�� ���� ��ü ����
		fruitLabel = new JLabel();
		
		// ���� �迭 ����
		String fruitList[] = {"persimmom", "banana", "pear", "apple", "cherry", "grape"};
		
		// �����̳� �����, ���̾ƿ� ����
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		// �޺��ڽ��� ���� ����Ʈ �߰�
		for (int i=0; i<fruitList.length; i++) {
			fruitCombo.addItem(fruitList[i]);
		}
		
		// �����̳ʿ� �޺��ڽ�, ���̺� �߰�
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		
		// �޺��ڽ��� �̺�Ʈ ������ ���
		fruitCombo.addItemListener(this);
		
		// ȭ�鿡 ���
		setTitle("JComboBox Test1");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
}

public class JComboBoxTest1 {
	public static void main(String[] args) {
		new JComboBox1();
	}
}