package a21_스태틱;


import lombok.Data;


@Data
public class Student {
	//static을 선언하게되면, 변수들이 기울어짐
	public static String name;
	public static String phone;
	
	//여기서의 out과 같은 개념 --> out이라는 static클래스 안의 println을 사용하는 것
	public static void studentiInfo() {
		System.out.println(name);
		System.out.println(phone);
	}
	
	

}
