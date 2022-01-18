package a10_클래스;
//Car에서 사용된 클래스
public class CarTest {
	//자동차 3대 만들기
	// carNumber = 문자열 , 43다 1317
	// model = 문자열 , k5
	
	// 메소드 carInfo 
	// 차량 번호는 43다 1317 이고, 모델은 k5입니다.
	// 가 출력되게 하기
	public static void main(String[] args) {
		//Car클래스에서 기본생성자는 private를 선언
		//매개변수를 가지는 새로운 생성자 생성 후, 매개변수포함 생성사 호출
		//매개변수가 포함되지 않은 생성자는 호출되지 않음
		//매개변수가 없는 기본생성자를 사용 하기위해선 public Car() 를 Car Class에 선언해주어야함
		Car c1 = new Car("43다 1317" , "k3") ;
		Car c2 = new Car("37노 6579" , "gv80") ;
		Car c3 = new Car("12gk 1891" , "avante") ;
		Car c4 = new Car();
		
		//외부에서 클래스 안으로 값을 보냄 = set
		c4.setCarNumber("33나 3324");
		//내부에서 클래스 밖으로 값을 꺼냄 = get
		System.out.println(c2.getCarNumber());
		
		c1.setSerialNumber(10);
		System.out.println("c1의 시리얼 번호 :" + c1.getSerialNumber());
		

		c1.CarInfo();
		c2.CarInfo();
		c3.CarInfo();
		c4.CarInfo();
		
	/* 모범답안
	 * Car c1 = new Car();
	 * Car c2 = new Car();
	 * Car c3 = new Car();
	 * 
	 * c1.carNumber = "43다 1317"
	 * c2.carNumber = "37노 6579"
	 * c3.carNumber = "12하 1891"
	 * 
	 * c1.model = "k5"
	 * c2.model = "gv80"
	 * c3.model = "avante"
	 * 
	 * c1.Carinfo()
	 * c2.Carinfo()
	 * c3.Carinfo()
	 * 	 */

	}

}
