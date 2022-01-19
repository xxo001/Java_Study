package a10_클래스;
//Student에서 사용된 클래스
public class StudentTest {

	public static void main(String[] args) {
		//new = 새롭게 생성할 것을 의미
		//뒤 Student = 새롭게 만들 생성자를 의미
		//앞Student = 클래스를 의미
		//여러 객체의 변수를 모두 만들필요 x  --> 하지만 new에 해당하는 s1같은 변수는 생성하여야 함
		
		//new Student 생성자를 통해 주소값 반환 후 s1에 저장 
		Student s1 = new Student();
		s1.name = "김재현";
		s1.addr = "부산진구";
		s1.phone = "01066106518";
		s1.studentYear = 3;
		
		//new Student 생성자를 통해 주소값 반환 후 s2에 저장
		//위의 new Student와 같아보이지만, 새로운 생성자를 만들기에 다른값이 들어감
		Student s2 = new Student();
		s2.name = "김재현2";
		s2.addr = "동래구";
		s2.phone = "01012345678";
		s2.studentYear = 2;
		
		//Student 클래스에 있는 StudentInfo메소드의 주소를 찾아가서 실행되기에, 
		//각 값이 입력되어 출력됨
		s1.studentInfo();
		s2.studentInfo();

		

	}

}
