/*
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 31일
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

// 성별 판넬 클래스 만들기
class RadioPanel extends JPanel implements ActionListener {
	// 성별을 나타내는 라디오 버튼 그룹 만들기
	ButtonGroup bg = new ButtonGroup();
	
	// 레이블 생성
	JLabel jl1 = new JLabel("  당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	
	// 라디오 버튼 생성
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자", "여자"};
	
	// 생성자
	public RadioPanel() {
		// 성별 라디오 버튼 객체 배열 생성
		for (int i=0; i<gender.length; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]); 	// 성별 판넬에 객체 추가
			
			// 버튼 그룹에 추가
			bg.add(jr[i]);
			
			// 리스너 등록
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

// 혈액형 판넬 클래스 만들기
class ComboBoxPanel extends JPanel implements ItemListener  {
	// 레이블 생성
	JLabel jl1 = new JLabel("  당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	
	// 생성자
	public ComboBoxPanel() {
		// 콤보박스 생성
		JComboBox<String> jcb = new JComboBox<String>();
		String btList[] = {"A형", "B형", "AB형", "O형"};
		for (int i=0; i<btList.length; i++) {
			jcb.addItem(btList[i]);
		}
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		//리스너 등록
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
	// 생성자
	public JTabPane() {
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// JTabbedPane() 객체 생성
		JTabbedPane jtp = new JTabbedPane();
		
		// 라디오 판넬, 콤보박스 판넬 객체 생성
		RadioPanel rp = new RadioPanel();
		ComboBoxPanel cp = new ComboBoxPanel();
		
		// JTabbedPane()에 판넬 추가
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		
		// 컨테이너에 추가
		ct.add(jtp);
		
		// 화면에 출력
		setTitle("JTabbedPane Test1");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}
}

public class JTabbedPaneTest {
	public static void main(String[] args) {
		new JTabPane();
	}
}