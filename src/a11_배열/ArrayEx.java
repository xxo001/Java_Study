package a11_배열;

public class ArrayEx {

	public static void main(String[] args) {
		//5개의 공간을 가진 int배열을 만들 것이다. --> 힙에다가 저장됨 --> 이 주소값을 num에다 넣겟다
		int[] num = new int[1000];
		
		//index에도 변수를 줄 수가 있음
		int index = 0;
		
		//5개의 공간에 10 20 30 40 50을 차례대로 입력 하는 반복문 사용 가능
		for(int i = 0 ; i < num.length; i++) {
			num[i] = 10 * (1+i);
		}
		
		//반복문을 통해 출력 가능
		//배열의 크기 만큼 반복을 할 때 --> //배열의 크기는 length로 사용 가능
		//num.length 는 num배열의 크기를 말함
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		//문자열 배열 생성과 입력을 동시
		String[] strArray = {"김재현", "김재현", "김재현"};
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}


	}

}
