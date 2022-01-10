package a09_메소드;

public class MethodEx {
	//1.매개변수, 반환값 x
	public static void printInfo() {
		/* void로 반환할 것도 없고, 매개변수도 없기에
		 * 실행시 그냥 순서대로 실행됌
		 */
		System.out.println("김");
		System.out.println("재");
		System.out.println("현");
		System.out.println("입");
		System.out.println("니");
		System.out.println("다");
	}
	//2.매개변수o , 반환값 x
	public static void printName(String name) {
		System.out.println("이름 :" + name );
	}
	
	//3.매개변수x , 반환값 o
	public static String getName() {
		String name = "김재현";
		return name ;//반환값와 매개변수의 자료형은 같아야 함
	}
	
	//4.매개변수o, 반환값o
	public static String transferName(String name) {
		String tName = name + "님";
		return tName;
	}
	//5. 두가지 매개변수
	public static String transferName2(String name, int number) {
		return number + "번 고객 :" + name;
	}

	public static void main(String[] args) {
		/* **메인 메소드**
		 * void(자료형) 메소드의 형태에서 void는 자료형의 위치이지만
		 * 공허하다는 뜻으로, 반환 받을것이 없다는 뜻
		 * main(메소드) string(매개변수)
		 * 클래스 안에 선언 된것은 메소드 , 밖에 선언 된것은 함수
		 * java는 모든 파일이 클래스이기에, 모든함수가 메소드
		 */
		
		//1.printInfo 메소드를 호출 >> 먼저 실행됌
		printInfo(); 
		System.out.println("프로그램 종료");
		
		//2. 매개변수를 받아서 printName 메소드를 호출 >> 두가지 방법
		String name = "김재현"; 
		printName("김재현");
		
		//3. getName에 반환값(김재현)이 있기에, name2변수에 초기화사용 가능
		String name2 = getName();
		System.out.println(name2);
		// 반환값이 들어있는 메소드기에 바로 사용도 가능
		System.out.println(getName());
		
		//4
		String name3 = transferName("김재현");
		System.out.println(name3);
		System.out.println(transferName("김재현"));
		
		//5. 메소드에서의 매개변수위치와 호출시 매개변수 위치가 같아야함
		System.out.println(transferName2("김재현", 1));
		
		
		
		

	}

}
