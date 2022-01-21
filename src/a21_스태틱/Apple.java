package a21_스태틱;

import lombok.Data;

@Data
public class Apple {
	//따라서 Apple객체 안에서만 private하게 생성 가능 
	//--> 자기 자신 객체에서 딱 1번만 생성
	public static Apple instance = new Apple();
	
	private int product_code;

	//Apple의 생성자 자체를 private으로 선언
	private Apple() {
		
	}
	
	//1번 생성된 객체를 가지고 오게 해주는 메소드
	//getInstance라는 이름을 쓰는 약속 --> 싱글톤사용자들의 약속
	public static Apple getInstance() {
		//<싱글톤에서 꼭 해주어야 할것>
		//혹시나 메모리가 가득차서 static한 Apple이 실행되지 않게되면, 이 메소드에서라도 생성되도록 해주어야 함
		if(instance == null) {
			instance = new Apple();
		}
		return instance;
	}
	
	public AppleProduct createProduct(String product_name, String version) {
		AppleProduct appleProduct = new AppleProduct(++product_code, product_name, version);
		return appleProduct;
	}

}
