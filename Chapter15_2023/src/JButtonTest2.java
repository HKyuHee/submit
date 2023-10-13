/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 13��
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// GUI Ŭ����
class JButton2 extends JFrame implements ActionListener {
	// �ؽ�Ʈ �ʵ� ��ü ����
	JTextField jtf;
	
	// ������
	public JButton2() {
		// �̹��� ������ ��ü ����
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// ��ư ��ü ����
		JButton nat1 = new JButton("���", apple);
		JButton nat2 = new JButton("�ٳ���", banana);
		JButton nat3 = new JButton("��", persimmom);
		JButton nat4 = new JButton("��", pear);
		JButton nat5 = new JButton("����", grape);
		
		// �ؽ�Ʈ ����� ��ü ����
		jtf = new JTextField(10);
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// GridLayout ��ġ ������ ����
		ct.setLayout(new GridLayout(3, 2));
		
		// �����̳ʿ� ��ư �߰�
		ct.add(nat1);
		ct.add(nat2);
		ct.add(nat3);
		ct.add(nat4);
		ct.add(nat5);
		ct.add(jtf);
		
		// ������Ʈ�� ������ ���
		nat1.addActionListener(this);
		nat2.addActionListener(this);
		nat3.addActionListener(this);
		nat4.addActionListener(this);
		nat5.addActionListener(this);
		
		// ȭ�鿡 ���̱�
		setTitle("JButton Test2");
		setSize(500, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}

public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();
	}
}