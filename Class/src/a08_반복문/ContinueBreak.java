package a08_반복문;

public class ContinueBreak {

	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			if (i % 2 == 0) { //짝수를 의미
				continue;
			}
			if (i == 81) {
				break;
			}
			System.out.println("i");
		}
	}

}
