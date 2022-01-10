package a09_메소드;
/*
 * 오버러드 = 같은이름이지만 다른 기능을 하는 메소드
 * 매개변수가 다르면 같은 이름이더라도 다른 메소드 이다.
 * 
 * **메소드의 이름은 같을수 없다**
 * 하지만 예외적으로, 매개변수의 자료형이 다르다면 가능하다.
 * **메소드의 자료형이 다르다고해서 오버로딩이 되진 않는다.
 */
public class Overload {
	// 두수의 합을 구하는 메소드
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void add(String num1, String num2) {
		System.out.println(num1 + num2);
	}
	
	public static void add(String num1, int num2) {
		System.out.println("String, int");
		System.out.println(num1 + num2);
	}
	
	

	public static void main(String[] args) {
		//매개변수의 자료형이 다르기에 사용가능
		add(5, 7);
		add("5", "7");
		add("5", 4);

	}

}
