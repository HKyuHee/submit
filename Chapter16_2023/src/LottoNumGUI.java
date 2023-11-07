/* 
 * 작성자 : 201995103 황규희
 * 작성일 : 2023년 11월 7일
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener {
	// 로또 번호 출력 될 라벨 생성
	private JLabel lotto_num = new JLabel();
	
	// 생성자
	public Lotto() {
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 레이아웃 설정 - FlowLayout
		ct.setLayout(new FlowLayout());
		
		// 버튼 객체 생성
		JButton lotto = new JButton("로또 번호 자동생성");
		
		// 컨테이너에 버튼과 라벨 추가
		ct.add(lotto);
		ct.add(lotto_num);
		
		// 버튼에 이벤트 리스너 추가
		lotto.addActionListener(this);
		
		// 화면에 보이기
		setTitle("Lotto Number Generate");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 윈도우 창 종료시 프로세스 닫기
		setVisible(true);									// 화면에 출력
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rnd_num = new Random();		// Random() 클래스로 객체 생성
		int[] lotto_number = new int[6];	// 배열 생성
		
		// 같은 번호가 있는지 확인하기 위한 변수 생성
		int temp;
		int i = 0;
		
		a: while(i < 6) {
			// 랜덤 번호 생성
			temp = rnd_num.nextInt(45)+1;
			
			// 배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤 수 발생
			for (int j=0; j <= i; j++) {
				if (temp == lotto_number[j]) {
					continue a;
				}
			}
			
			// temp 값 배열에 저장.
			lotto_number[i] = temp;
			i++;
		}
		
		lotto_num.setText("이번 주 로또 당첨번호 : " + Arrays.toString(lotto_number));
	}
}

public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}