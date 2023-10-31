/*
 * �ۼ��� : 201995103 Ȳ����
 * �ۼ��� : 2023�� 10�� 31��
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

// ���� �ǳ� Ŭ���� �����
class RadioPanel extends JPanel implements ActionListener {
	// ������ ��Ÿ���� ���� ��ư �׷� �����
	ButtonGroup bg = new ButtonGroup();
	
	// ���̺� ����
	JLabel jl1 = new JLabel("  ����� ������? ");
	JLabel jl2 = new JLabel("");
	
	// ���� ��ư ����
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"����", "����"};
	
	// ������
	public RadioPanel() {
		// ���� ���� ��ư ��ü �迭 ����
		for (int i=0; i<gender.length; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]); 	// ���� �ǳڿ� ��ü �߰�
			
			// ��ư �׷쿡 �߰�
			bg.add(jr[i]);
			
			// ������ ���
			jr[i].addActionListener(this);
		}
		
		add(jl1);
		add(jl2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s);
	}
}

// ������ �ǳ� Ŭ���� �����
class ComboBoxPanel extends JPanel implements ItemListener  {
	// ���̺� ����
	JLabel jl1 = new JLabel("  ����� ��������? ");
	JLabel jl2 = new JLabel("");
	
	// ������
	public ComboBoxPanel() {
		// �޺��ڽ� ����
		JComboBox<String> jcb = new JComboBox<String>();
		String btList[] = {"A��", "B��", "AB��", "O��"};
		for (int i=0; i<btList.length; i++) {
			jcb.addItem(btList[i]);
		}
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		//������ ���
		jcb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s = e.getItem();
		jl2.setText(s.toString());
	}
}

// GUI
class JTabPane extends JFrame {
	// ������
	public JTabPane() {
		// �����̳� ����
		Container ct = getContentPane();
		
		// JTabbedPane() ��ü ����
		JTabbedPane jtp = new JTabbedPane();
		
		// ���� �ǳ�, �޺��ڽ� �ǳ� ��ü ����
		RadioPanel rp = new RadioPanel();
		ComboBoxPanel cp = new ComboBoxPanel();
		
		// JTabbedPane()�� �ǳ� �߰�
		jtp.addTab("����", rp);
		jtp.addTab("������", cp);
		
		// �����̳ʿ� �߰�
		ct.add(jtp);
		
		// ȭ�鿡 ���
		setTitle("JTabbedPane Test1");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ â ����� ���μ��� �ݱ�
		setVisible(true);									// ȭ�鿡 ���
	}
}

public class JTabbedPaneTest {
	public static void main(String[] args) {
		new JTabPane();
	}
}