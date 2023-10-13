/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 13��
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// GUI Ŭ����
class JTFJA1 extends JFrame implements ActionListener {
	// �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField input;
	
	// �ؽ�Ʈ ����� ��ü ����
	private JTextArea output;
	
	// �� ��ü ����
	private JLabel jl = new JLabel("�ؽ�Ʈ�� �Է��ϼ���.");
	
	// ������
	public JTFJA1() {
		// 20�� �Է� ������ �ؽ�Ʈ �ʵ� ��ü ����
		input = new JTextField(20);
		
		// 10�� 20ĭ �ؽ�Ʈ ����� ��ü ����
		output = new JTextArea(10, 20);
		
		// �ؽ�Ʈ ����� ���� �Ұ� ����
		output.setEditable(false);
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// FlowLayout ����
		ct.setLayout(new FlowLayout());
		
		// �г� ����
		JPanel jp1 = new JPanel();
		
		// �гο� input/output �߰�
		jp1.add(input);
		jp1.add(output);
		
		// �гΰ� ���̺��� �����̳ʿ� �߰�
		ct.add(jp1);
		ct.add(jl);
		
		// ������Ʈ�� ������ ���
		input.addActionListener(this);
		
		// ȭ�鿡 ���̵���... ������ : 500, 300
		setTitle("JTextField, JTextArea Test1");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) {		// �ؽ�Ʈ ����� ũ�⺸�� ���� �� �߰�
			output.append(e.getActionCommand() + "\n");		// output�� �� ���� �߰�
			input.setText("");								// �� ���� ����(��ĭ����)
		}
		else {												// ���� ������..
			jl.setText("�Է��� ����Ǿ����ϴ�.");
			input.setEditable(false);						// �Է� �Ұ�
		}
	}
}

// ���� Ŭ����
public class JTFJATest1 {
	public static void main(String[] args) {
		new JTFJA1();
	}
}