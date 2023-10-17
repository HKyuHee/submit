/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 10월 17일
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.*;

//1. 처리할 이벤트 종류 결정 - 버튼
//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성

// GUI 클래스
class GUI2 extends JFrame implements ActionListener {
	// 속성으로 텍스트 에어리어와 텍스트 필드를 선언
	private JTextArea jta;
	private JTextField jtf;
	
	// 생성자
	public GUI2() {
		// 10줄 20칸 텍스트 에어리어 객체 생성 - 글 내용 출력
		jta = new JTextArea(10, 20);
		
		// 20자 입력 가능한 텍스트 필드 객체 생성 - 파일 저장명 입력
		jtf = new JTextField(20);
		
		// 버튼 객체 생성
		JButton jbt = new JButton("파일 읽어오기");
		
		// 텍스트 에어리어 수정 불가
		jta.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayout 설정
		ct.setLayout(new FlowLayout());
		
		// 패널 생성
		JPanel jp = new JPanel();
		
		// 패널에 텍스트 필드, 버튼 추가
		jp.add(jtf);
		jp.add(jbt);
		
		// 컨테이너에 텍스트 에어리어, 패널 추가
		ct.add(jp);
		ct.add(jta);
		
		// 3. 이벤트를 받아들일 버튼에 리스너 등록
		jbt.addActionListener(this);
		
		// 화면에 보이기
		setTitle("GUI Test2");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}
	
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
		// 입출력을 위한 예외처리
		try {
			String s = jtf.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			// 파일의 내용을 텍스트 에어리어의 내용으로 설정
			jta.setText(dis.readUTF());
			
			// 파일 닫기
			fis.close();
			
			System.out.print(s + "파일을 읽었습니다.");
		}
		catch(Exception e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}

public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}
}