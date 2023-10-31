/*
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 31일
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class JComboBox1 extends JFrame implements ItemListener {
	JLabel fruitLabel;		// 이미지가 표시될 영역
	
	public JComboBox1() {
		// 콤보박스 객체 생성
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		// 이미지 표시 영역 객체 생성
		fruitLabel = new JLabel();
		
		// 과일 배열 생성
		String fruitList[] = {"persimmom", "banana", "pear", "apple", "cherry", "grape"};
		
		// 컨테이너 만들기, 레이아웃 지정
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		// 콤보박스에 과일 리스트 추가
		for (int i=0; i<fruitList.length; i++) {
			fruitCombo.addItem(fruitList[i]);
		}
		
		// 컨테이너에 콤보박스, 레이블 추가
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		
		// 콤보박스에 이벤트 리스너 등록
		fruitCombo.addItemListener(this);
		
		// 화면에 출력
		setTitle("JComboBox Test1");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
}

public class JComboBoxTest1 {
	public static void main(String[] args) {
		new JComboBox1();
	}
}