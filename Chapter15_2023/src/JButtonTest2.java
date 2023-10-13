/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 13일
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// GUI 클래스
class JButton2 extends JFrame implements ActionListener {
	// 텍스트 필드 객체 선언
	JTextField jtf;
	
	// 생성자
	public JButton2() {
		// 이미지 아이콘 객체 생성
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// 버튼 객체 생성
		JButton nat1 = new JButton("사과", apple);
		JButton nat2 = new JButton("바나나", banana);
		JButton nat3 = new JButton("감", persimmom);
		JButton nat4 = new JButton("배", pear);
		JButton nat5 = new JButton("포도", grape);
		
		// 텍스트 에어리어 객체 생성
		jtf = new JTextField(10);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// GridLayout 배치 관리자 생성
		ct.setLayout(new GridLayout(3, 2));
		
		// 컨테이너에 버튼 추가
		ct.add(nat1);
		ct.add(nat2);
		ct.add(nat3);
		ct.add(nat4);
		ct.add(nat5);
		ct.add(jtf);
		
		// 컴포넌트에 리스너 등록
		nat1.addActionListener(this);
		nat2.addActionListener(this);
		nat3.addActionListener(this);
		nat4.addActionListener(this);
		nat5.addActionListener(this);
		
		// 화면에 보이기
		setTitle("JButton Test2");
		setSize(500, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}
	
	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}

public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();
	}
}