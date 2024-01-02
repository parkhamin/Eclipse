package day15;

import javax.swing.JFrame;
// 컨테이너(container)클래스
// -> 컴포넌트 클래스들을 포함할 수 있는 클래스, 바탕이 되는 클래스
// ex) 프레임, 패널
// 컴포넌트(component) 클래스
// ex) 버튼, 레이블, 텍스트 필드, 텍스트 영역, 메뉴, 슬라이드바 등

// GUI를 만드는 방법 1 -> Java의 컨테이너 클래스를 그대로 사용
// GUI를 만드는 방법 2 -> Java의 컨테이너 클래스를 상속해서 사용

// JFrame -> 가장 기초가 되는 컨테이너 클래스
class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,500); // 프레임의 가로세로 크기를 지정, 단위는 픽셀
		setLocation(500,100); // 프레임의 생성 위치를 지정, 기준점은 모니터의 왼쪽 상단 모서리가 0,0
		setTitle("내 생의 두번째 프레임");
		// 프레임의 제목 지정
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼 클릭했을 때의 동작, 프레임을 닫으며 프로그램 종료
		// 만약 지정을 하지 않으면, 프레임을 닫아도 프로그램을 계속 실행됨
		setVisible(true);
		// 프레임을 모니터 화면에 보여주게하는 속성
		// 기본값이 false -> true로 바꿔줘야 함.
	}
}

public class GUI2 {

	public static void main(String[] args) {
		MyFrame a = new MyFrame();

	}

}
