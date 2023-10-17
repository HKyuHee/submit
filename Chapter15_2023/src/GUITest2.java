/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 17��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.*;

//1. ó���� �̺�Ʈ ���� ���� - ��ư
//2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�

// GUI Ŭ����
class GUI2 extends JFrame implements ActionListener {
	// �Ӽ����� �ؽ�Ʈ ������ �ؽ�Ʈ �ʵ带 ����
	private JTextArea jta;
	private JTextField jtf;
	
	// ������
	public GUI2() {
		// 10�� 20ĭ �ؽ�Ʈ ����� ��ü ���� - �� ���� ���
		jta = new JTextArea(10, 20);
		
		// 20�� �Է� ������ �ؽ�Ʈ �ʵ� ��ü ���� - ���� ����� �Է�
		jtf = new JTextField(20);
		
		// ��ư ��ü ����
		JButton jbt = new JButton("���� �о����");
		
		// �ؽ�Ʈ ����� ���� �Ұ�
		jta.setEditable(false);
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// FlowLayout ����
		ct.setLayout(new FlowLayout());
		
		// �г� ����
		JPanel jp = new JPanel();
		
		// �гο� �ؽ�Ʈ �ʵ�, ��ư �߰�
		jp.add(jtf);
		jp.add(jbt);
		
		// �����̳ʿ� �ؽ�Ʈ �����, �г� �߰�
		ct.add(jp);
		ct.add(jta);
		
		// 3. �̺�Ʈ�� �޾Ƶ��� ��ư�� ������ ���
		jbt.addActionListener(this);
		
		// ȭ�鿡 ���̱�
		setTitle("GUI Test2");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// 4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent ae) {
		// ������� ���� ����ó��
		try {
			String s = jtf.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			// ������ ������ �ؽ�Ʈ ������� �������� ����
			jta.setText(dis.readUTF());
			
			// ���� �ݱ�
			fis.close();
			
			System.out.print(s + "������ �о����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}

public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}
}