package a16_인터페이스;

//초인종은 버튼이 아니다, 하지만 버튼의 기능을 가지고있다 --> 인터페이스
public class 초인종 implements Button {
	@Override
	public void onClick() {
		System.out.println("초인종을 울린다");
		
	}
	
}
