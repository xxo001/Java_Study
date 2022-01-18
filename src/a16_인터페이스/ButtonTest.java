package a16_인터페이스;

public class ButtonTest {

	public static void main(String[] args) {
		Button[] buttons = new Button[5];
		
		buttons[0] = new 초인종();
		buttons[1] = new 자동문버튼();
		
		//자동문과 초인종은 다른 클래스이지만, onClick(버튼동작)의 하나의 동작을 하기때문에
		//인터페이스 묶어서 한번에 실행 --> 중앙 제어장치 또는 상속에서의 업캐스팅 후 일괄적으로 메소드 실행하는것과 동일로 이해
		for(Button button : buttons) {
			if(button == null) {
				continue;
			}
			button.onClick();
		}
	}

}
