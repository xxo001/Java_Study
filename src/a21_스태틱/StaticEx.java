package a21_스태틱;
//static : 공유
public class StaticEx {

	public static void main(String[] args) {
		//static을 선언하게되면, 객체를 생성하지 않고도 변수 , 메소드 사용 가능
		Student.name = "김재현";
		Student.phone = "010-6610-6518";
		Student.studentiInfo();
		

	}

}
