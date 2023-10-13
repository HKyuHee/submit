/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 10��
 * 
 * ������ �̺�Ʈ ó�� Ŭ������ �̿��� �̺�Ʈ ó��
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

// �̺�Ʈ ó�� Ŭ����
class EventClass implements ActionListener {
	JLabel jl;
	
	// �����ڸ� ���� JLabel ��ü ����
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	
	// ������ �������̽��� ����� �޼ҵ带 �������̵� �Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
}

// GUI Ŭ���� - ��ư 2���� ���̺� 1��
class Event3 extends JFrame {
	// JLabel ��ü�� �Ӽ����� ���
	JLabel jl;
	
	// JButton ��ü�� �Ӽ����� 2�� ���
	JButton jb1, jb2;
	
	public Event3() {
		// �����̳� ����
		Container ct = getContentPane();
		
		// ��ġ ������ ���� (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		// ��ư ����
		jb1 = new JButton("�ȳ��ϼ���.");
		jb2 = new JButton("�ູ�� �Ϸ��Դϴ�.");
		
		// ���̺� ����
		jl = new JLabel("��ư�� ��������.");
		
		// �����̳ʿ� ��ư�� ���̺� ���
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		
		// �̺�Ʈ�� �޾Ƶ��� ������Ʈ�� ������ ���
		jb1.addActionListener(new EventClass(jl));
		jb2.addActionListener(new EventClass(jl));
		
		setTitle("�̺�Ʈ �׽�Ʈ3");
		setSize(300, 200);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// ȭ�鿡 ���
		setVisible(true);
	}
}

// ���� Ŭ����
public class EventTest3 {
	public static void main(String[] args) {
		new Event3();
	}
}