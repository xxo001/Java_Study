package a15_무명클래스;

public class KeyBoardMain {

	public static void main(String[] args) {
		//추상 클래스에있는 추상 클래스를 사용 --> 모든 메소드를 override해주어야 사용 가능
		//추상 클래스에있는 일반 메소드를 사용 --> 필요한 메소드만 가져와서 사용 가능
		//--> 모두사용할때는 추상메소드를, 일부 골라서 사용할때는 일반메소드를 선언
		KeyBoard keyUp = new KeyBoard() {
			@Override
			public void KeyUp() {
				System.out.println("위쪽 버튼을 눌렀습니다.");
			}
		};
		
		KeyBoard keyDown = new KeyBoard() {
			@Override
			public void KeyDown() {
				System.out.println("아래 버튼을 눌렀습니다.");
			}

		};
		keyUp.KeyUp();
		keyDown.KeyDown();

	}
	
}
