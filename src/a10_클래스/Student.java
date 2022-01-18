package a10_클래스;
//main은 프로그램을 시작하는 곳
//이 클래스는 클래스의 정보만을 담는 곳이기때문에, main이 없음
public class Student {
	String name;
	int studentYear;
	String addr;
	String phone;
	
	// 메소드
	void studentInfo() {
		System.out.println("이름 :" + name);
		System.out.println("학년 :" + studentYear);
		System.out.println("주소 :" + addr);
		System.out.println("전화번호 :" + phone);
	}
	
	
	//1. 기본생성자 (생략가능)
	//메소드와 비슷한 형태지만, void나 return을 사용 하지 않음
	//Student() = 생성자이기 때문에, 자동으로 주소값을 반환 함 --> return을 통해 반환하지 않음
	//생성자가 호출될때 마다 "학생 만들어짐?" 을 출력
	public Student() {
		System.out.println("학생 만들어짐?");
		
	}
	

	

}
