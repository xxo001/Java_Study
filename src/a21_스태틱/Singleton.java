package a21_스태틱;

public class Singleton {

	public static void main(String[] args) {
		//static 데이터를 사용할때는 Apple. 를 꼭 해주어야함
		//--> 어디에 속해있는 메소드,데이터 인지 알수 없기때문
		Apple 본사 = Apple.getInstance();
		Apple 한국지사 = Apple.getInstance();
		
		본사.setProduct_code(100);
		한국지사.setProduct_code(200);
		
		//한번 생성된 같은 객체가 대입되었기 때문에, 200이 출력됨
		System.out.println(본사.getProduct_code());
		
		AppleProduct iphone12 = 본사.createProduct("iphone", "12");
		AppleProduct iphone13 = 한국지사.createProduct("iphone", "13");
		AppleProduct ipad_pro = 한국지사.createProduct("아이패드", "pro");
		
		System.out.println(iphone12);
		System.out.println(iphone13);
		System.out.println(ipad_pro);

	}

}
