package a19_제네릭;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

//T라는 매개변수를 지정 --> 클래스를 생성할때 매개변수를 String을주면 T가 String이 됨 --> 자유자재
public class Message<T> {
	private int code;
	private T data;

}

/*
제네릭의 기능 >> **제네릭 상속**
T extends User : User이거나 User를 상속 받는 객체들만 T에 들어올 수있음
public class Message<T extends User> {
private int code;
private T data;
}
*/

