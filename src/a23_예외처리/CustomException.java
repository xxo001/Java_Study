package a23_예외처리;

//RuntimeException오류를 상속 --> custom하기 위해
//RuntimeException은 프로그램이 실행중에 오류가 났을때를 의미
//최고상위 <Exception> 그 바로하위가 <RuntimeException> 그하위가.....<null...>,,,<index>,,등
public class CustomException extends RuntimeException {
	
	/**
	 * 많은 오류가 발생할 때 오류들을 직렬화 해주는 명령
	 */
	private static final long serialVersionUID = 1L;
	
	//상속받은 RuntimeException 아래와 같이 커스텀
	//throw받은 "오류가 났어요" message를 상위 클래스에 전달 -->  상위클래스에선 출력을 해줌
	public CustomException(String message) {
		super(message);
	}
	
	
}
