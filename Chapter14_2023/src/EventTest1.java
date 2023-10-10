/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 10��
 * 
 * GUI Ŭ�������� �̺�Ʈ ó���ϴ� ���
 * 1. ó���� �̺�Ʈ ���� ���� - ActionEvent
 * 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ� - ActionListener
 * 3. �̺�Ʈ�� �޾Ƶ��� ������Ʈ�� ������ ���
 * 4. ������ �������̽��� ����� �޼ҵ带 �������̵� �Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event1 extends JFrame implements ActionListener{
	JLabel jl;	// JLabel ��ü�� �Ӽ����� ���
	
	public Event1() {
		// �����̳� ����
		Container ct = getContentPane();
		
		// ��ġ ������ ���� (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		// ��ư ����
		JButton jb = new JButton("��ư");
		
		// ���̺� ����
		jl = new JLabel("��ư�� ���� �ּ���.");
		
		// �����̳ʿ� ��ư�� ���̺� ���
		ct.add(jb);
		ct.add(jl);
		
		// �̺�Ʈ�� �޾Ƶ��� ������Ʈ�� ������ ���
		jb.addActionListener(this);		// ��ư ��ü�� ������ ���
		
		setTitle("�̺�Ʈ �׽�Ʈ1");
		setSize(300, 200);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
	}
	
	// ������ �������̽��� ����� �޼ҵ带 �������̵� �Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText("�ȳ��ϼ���");
	}
}

public class EventTest1 {
	public static void main(String[] args) {
		new Event1();
	}
}