/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 27일
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener {
	// 텍스트 필드 객체 선언
	JTextField jtf;
	
	// 생성자
	public JCheckBox1() {
		// 체크박스 객체 생성
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		
		// 20자 입력 가능한 텍스트 필드 객체 생성
		jtf = new JTextField(20);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayout 설정
		ct.setLayout(new FlowLayout());
		
		// 컨테이너에 체크박스, 텍스트 필드 추가
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		
		// 컴포넌트에 리스너 등록
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		// 화면에 보이기 (사이즈 : 250, 100)
		setTitle("JCheckBox Test1");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}
	
	// 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
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