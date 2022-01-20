package a19_제네릭;

public class GenericEx {
	
	//제네릭의 기능 >> **와일드 카드** 
	//Message<?> >> 매개변수에 ? 를 넣어주었기 때문에, return을 다양한 형태로 받을 수 있음
	//제네릭에 따라서 data의 자료형을 personalUser  companyUser user 로 다양하게 바꿀수 잇음
	//와일드 카드도 상속이 가능 Message<? extedns User>
	//User거나 User를 상속받는 객체만 return을 받을 수 있음
	public Message<?> sendMessage(int select){
		if(select == 1) {
			PersonalUser personalUser = new PersonalUser("kim jae hyeon");
			return new Message<PersonalUser>(10, personalUser);
		}
		else if(select == 2) {
			CompanyUser companyUser = new CompanyUser("koreait");
			return new Message<CompanyUser>(20, companyUser);
		}
		else {
			User user = new User("aaaa" , "1234");
			return new Message<User>(0, user);
			
		}
	}
	
	public static void main(String[] args) {
		//T자리에 String을 넣어서 클래스 생성 --> String 데이터 입력 가능
		Message<String> strMessage = new Message<String>();
		strMessage.setCode(10);
		strMessage.setData("오류 메세지 입니다.");
		//toString자동 실행
		System.out.println("strMessage" + strMessage);
		
		
		User user = new User();
		user.setUsername("xxo001");
		user.setPassword("1234");
		//T자리에 User객체를 넣어서 클래스 생성 --> User 객체 입력 가능
		Message<User> userMessage = new Message<User>(20, user);
		//User객체 입력
		userMessage.setCode(20);
		userMessage.setData(user);

		//toString자동실행
		System.out.println("userMessage"+ userMessage);
		
	}

}
