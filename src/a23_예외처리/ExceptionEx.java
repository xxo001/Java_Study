package a23_예외처리;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
class Message {
	private String name;
}

public class ExceptionEx {
	
	//Exception 예외가 발생 할 수 있는 test 메소드 선언 --> 예외처리 미루기
	public void test() throws Exception {
		System.out.println("test");
	}

	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		//따라서 test메소드를 사용하기 위해선, try/catch를 사용 해주어야 함
		try {
			ex.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//throw를 통해 오류를 만들어 버리는 구문 
		// --> throw를 만나면, 아래의 동작을 하지않고 CustomException로 이동해 버림
		if(1 == 1) {
			throw new CustomException("오류가 났어요.");			
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Message> messageList = new ArrayList<Message>();
		
		//인덱스 0 ~ 9 까지의 List
		for(int i = 0 ; i < 10; i++) {
			list.add(i+1);
			if(i%2 == 0) {
				messageList.add(new Message("test"));				
			}else {
				messageList.add(null);
			}
		}
		
		//인덱스 10번에 데이터를 입력한다면, 
		//IndexOutOfBoundsException 오류가 발생 함 -> 프로그램이 멈춰 버림
		//--> 예외처리를 사용하여 잠시 미뤄두거나, 다른처리를 해줌 
		//<예외처리의 한 세트 <try/catch>>
		// [try]는 오류가 날 수도 있는 구문 
		try {
			//<index오류>
			for(int i = 0 ; i < 10; i++) {
				System.out.println(list.get(i));
			}
			//<null오류>
			for(int i = 0 ; i < 10; i++) {
				System.out.println(messageList.get(i).getName());
			}
		}
		// [catch]는 예상되는 오류를 입력 
		//  printStrackTrace를 해주어야 무슨 오류가 발생하는지 출력 됨
		// <index오류 예외처리>
		catch(IndexOutOfBoundsException boundsException) {
			boundsException.printStackTrace();
		// <null오류 예외처리>  --> catch 는 여러개 사용 가능
		}catch(NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
		// <예외처리의 최상위> --> 모든 오류를 예상하고 예외처리 할수 없기에 사용
		}catch(Exception exception) { 
			exception.printStackTrace();
		}
		// [finally]는 try와 catch가 종료될때 무조건 실행되어야 하는 명령을 입력
		finally {
			System.out.println("문서 저장");
		}
		System.out.println("프로그램 종료");
		

		
	
		
		
		
	}

}
