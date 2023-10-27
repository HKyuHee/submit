/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 27��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener {
	// �ؽ�Ʈ �ʵ� ��ü ����
	JTextField jtf;
	
	// ������
	public JCheckBox1() {
		// üũ�ڽ� ��ü ����
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		
		// 20�� �Է� ������ �ؽ�Ʈ �ʵ� ��ü ����
		jtf = new JTextField(20);
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// FlowLayout ����
		ct.setLayout(new FlowLayout());
		
		// �����̳ʿ� üũ�ڽ�, �ؽ�Ʈ �ʵ� �߰�
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		
		// ������Ʈ�� ������ ���
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		// ȭ�鿡 ���̱� (������ : 250, 100)
		setTitle("JCheckBox Test1");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void itemStateChanged(ItemEvent e) {
		jtf.setText(((JCheckBox)e.getItem()).getText());
	}
}

public class JCheckBoxTest1 {
	public static void main(String[] args) {
		new JCheckBox1();
	}
}