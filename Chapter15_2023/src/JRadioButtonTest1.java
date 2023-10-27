/* 
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 27��
 */

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JRadioButton1 extends JFrame implements ActionListener {
	JLabel jl3;
	
	String[] hobby = {"�ȱ�", "���", "����", "��Ų�����", "�䷯�۶��̵�"};
	String[] age = {"20��", "30��", "40��", "50��", "60��"};
	
	JCheckBox[] jc = new JCheckBox[5];
	JRadioButton[] jr = new JRadioButton[5];
	
	public JRadioButton1() {
		jl3 = new JLabel();
		
		JLabel jl1 = new JLabel("����� ��̴�?");
		JLabel jl2 = new JLabel("����� ���̴�?");
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		
		ButtonGroup bg = new ButtonGroup();
		
		for (int i=0; i<5; i++) {
			jc[i] = new JCheckBox(hobby[i]);
			jr[i] = new JRadioButton(age[i]);
			
			hobbypanel.add(jc[i]);
			agepanel.add(jr[i]);
			
			jr[i].addActionListener(this);
			bg.add(jr[i]);
		}
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// �����̳ʿ� ���̾ƿ� ����
		ct.setLayout(new GridLayout(3, 1));
		
		// �ǳ� jp1 ����, jp1�� ������Ʈ �߰�
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		
		// �ǳ� jp2 ����, jp2�� ������Ʈ �߰�
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		
		// �ǳ� jp3 ����, jp3�� ������Ʈ �߰�
		JPanel jp3 = new JPanel();
		jp3.add(jl3);
		
		// �����̳ʿ� �ǳ� �߰�
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// ȭ�鿡 ���̱� (������ : 400, 300)
		setTitle("JRadioButton Test1");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
	
	// ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = "����� ��� : ";
		
		for (int i=0; i<5; i++) {
			if(jc[i].isSelected() == true) {
				s = s+hobby[i]+" ";
			}
		}
		s = s+" ����� ���� : ";
		jl3.setText(s+ae.getActionCommand());
	}
}

public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}
}