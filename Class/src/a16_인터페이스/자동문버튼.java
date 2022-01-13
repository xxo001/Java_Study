package a16_인터페이스;

//자동문은 버튼이 아니다, 하지만 버튼의 기능을 가지고있다 --> 인터페이스
public class 자동문버튼 implements Button {
	@Override
	public void onClick() {
		System.out.println("자동문을 연다.");
		
	}
}
