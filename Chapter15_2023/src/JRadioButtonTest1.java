/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 27일
 */

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JRadioButton1 extends JFrame implements ActionListener {
	JLabel jl3;
	
	String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "페러글라이딩"};
	String[] age = {"20대", "30대", "40대", "50대", "60대"};
	
	JCheckBox[] jc = new JCheckBox[5];
	JRadioButton[] jr = new JRadioButton[5];
	
	public JRadioButton1() {
		jl3 = new JLabel();
		
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
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
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 컨테이너에 레이아웃 설정
		ct.setLayout(new GridLayout(3, 1));
		
		// 판넬 jp1 생성, jp1에 컴포넌트 추가
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		
		// 판넬 jp2 생성, jp2에 컴포넌트 추가
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		
		// 판넬 jp3 생성, jp3에 컴포넌트 추가
		JPanel jp3 = new JPanel();
		jp3.add(jl3);
		
		// 컨테이너에 판넬 추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// 화면에 보이기 (사이즈 : 400, 300)
		setTitle("JRadioButton Test1");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}
	
	// 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미 : ";
		
		for (int i=0; i<5; i++) {
			if(jc[i].isSelected() == true) {
				s = s+hobby[i]+" ";
			}
		}
		s = s+" 당신의 나이 : ";
		jl3.setText(s+ae.getActionCommand());
	}
}

public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}
}