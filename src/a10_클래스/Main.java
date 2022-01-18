package a10_클래스;
	//캡슐화  
	//할인율을 계산 하는 프로그램
	//모든 상품의 할인율을 변경할 수 없기에, 메소드를 이용
public class Main {
	//Service객체자체 를 private으로 캡슐화
	private Service service;
	
	//Main이 생성되어야만 Service객체 사용가능 하도록 선언
	public Main() {
		service = new Service();
	}

	//컴퓨터의 할인율
	public int coumputer(int price) {
		return price - (int)(price * service.getDiscount());
	}
	//폰의 할인율
	public int phone(int price) {
		return price - (int)(price * service.getDiscount());
	}
	
	//static내부에서는 자기자신도 바로 호출 불가
	//Main m = new Main(); 으로 생성해주어야 클래스 사용 가능
	//Main이 생성되어 Service객체 생성 -> 사용가능
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.coumputer(1000000));
		System.out.println(m.phone(800000));
		
	}

}
