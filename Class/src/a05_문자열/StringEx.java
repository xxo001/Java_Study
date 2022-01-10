package a05_문자열;

public class StringEx {

	public static void main(String[] args) {
		int num = 1;
		char c = 'A';
		String name = "김재현";
		System.out.println("안녕하세요." +name+ "입니다."); 
		System.out.println(num+(c+"안녕하세요")+(1+1));
		// 괄호를 이용하여 연산 순위를 바꿔주어 1A안녕하세요2가 나올수있다

	}

}
