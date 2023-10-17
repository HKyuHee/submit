/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 17��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.*;

// 1. ó���� �̺�Ʈ ���� ���� - ��ư
// 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�

// GUI Ŭ����
class GUI1 extends JFrame implements ActionListener{
	// �Ӽ����� �ؽ�Ʈ ������ �ؽ�Ʈ �ʵ带 ����
	private JTextArea jta;
	private JTextField jtf;
	
	// ������
	public GUI1() {
		// 10�� 20ĭ �ؽ�Ʈ ����� ��ü ���� - �� ���� �Է�
		jta = new JTextArea("���� ������ �Է��ϼ���.", 10, 20);
		
		// 20�� �Է� ������ �ؽ�Ʈ �ʵ� ��ü ���� - ���� ����� �Է�
		jtf = new JTextField("���� �̸��� �Է��ϼ���.", 20);
		
		// ��ư ��ü ����
		JButton jbt = new JButton("���Ϸ� ����");
		
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
		ct.add(jta);
		ct.add(jp);
		
		// 3. �̺�Ʈ�� �޾Ƶ��� ��ư�� ������ ���
		jbt.addActionListener(this);
		
		// ȭ�鿡 ���̱�
		setTitle("GUI Test1");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// 4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent ae) {
		// ������� ���� ����ó��
		try {
			// ���� �̸����� ��� ��ü ����
			String s = jtf.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			// �ؽ�Ʈ ������� ������ ���Ϸ� ���
			dos.writeUTF(jta.getText());
			
			// ���� �ݱ�
			fos.close();
			
			System.out.print(s + "������ �����Ǿ����ϴ�.");
		}
		catch(Exception e) {
			
		}
	}
}

public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}
}