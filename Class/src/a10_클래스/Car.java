package a10_클래스;
/*
 *  접근 지정자
 *  public
 *  protected
 *  default
 *  private
 */
public class Car {
	//private 로 동일클래스 내에서만 사용 가능
	private String carNumber ;
	private String model ;
	private int serialNumber ;
	
	
	//기본생성자(c4)를 사용하기위해 선언
	//오버로딩을 할 시 필수
	//null
	//null 의결과 --> 주소만있고 값이 없기때문
	public Car()	{
		System.out.println(carNumber);
		System.out.println(model);

	}
	//오버로딩--> 매개변수가있는 생성자 선언
	//동일한 변수명을 가지고있을때, 매개변수가 우선순위가 높음
	//carNumber에 carNumber를 넣어야 하기때문에, this 사용
	//this는 클래스 즉 그 객체의 주소값임 --> 
	//매개변수로 받은 carNumber를 this 즉 내 클래스 carNumber에 대입하라
	//a10_클래스.Car@5aaa6d82
	//a10_클래스.Car@73a28541
	//a10_클래스.Car@6f75e721 의 결과
	public Car(String carNumber, String model) {
		System.out.println(this);
		this.carNumber = carNumber;
		this.model = model;
		
	}
	//<Setter : 외부의 변수를 안으로 세팅 해주는변수이기에, 매개변수가 필수>
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void setModel(String model) {
		this.model = model;
	}
	//<Getter : 내부의 변수를 밖으로 가져다 주는 변수이기에 return(반환)이 필수>
	//private으로 선언된 carNumber를 String으로 반환받아 외부로 보내줌
	//내부 > 외부 이기때문에 매개변수 x  --> this가 굳이 필요하지 않음
	public String getCarNumber() {
		return carNumber;
	}
	public String getModel() {
		return model;
	}
	
	//set으로 매개변수에 받는 값에 규칙을 정할 수 있음
	//private으로 클래스변수를 선언 해놓지 않으면, 프로그래밍 할때 규칙을 벗어날 수 있음
	//따라서 프라이빗으로 변수를 보호 --> 캡슐화
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber + 20210000;
	}
	//get도 규칙을 줄 수 있음
	public int getSerialNumber() {
		return serialNumber - 20210000;
	}

	
	
	public void CarInfo() {
		System.out.println("차량 번호는 "+ carNumber + "이고, 모델은" + model + " 입니다");
	}



}
