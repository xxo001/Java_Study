package a08_반복문;

import java.util.Scanner;

public class LoopController {
		 //회원가입, 로그인 페이지 > 콘솔프로그램의 기초
		   //프로그램종료를 선택하기전까진 프로그램이 종료되지 않음 > 무한루프
		   //while  내부의 while 에서 break를 걸어주면, 프로그램이 완전히 끝나는 것이아닌
		   //바깥이 while 로 나가는 것이다.
		   //내부의 break로도 모든 프로그램을 종료하기 위해서는 가장 바깥의 while 조건을
		   //true가 아닌 지정을 해주어야 한다
		   //loopflag가 true이기에 루프는 반복되고, break대신 loopflag에 false를 걸어주면
		   //모든 루프가 종료된다
		   public static void main(String[] args) {
		      Scanner in = new Scanner(System.in);
		      
		      boolean loopflag = true ;
		      int cmd ;
		      
		      while(loopflag) {
		         System.out.println("[JAVA 사이트]");
		         System.out.println("1. 회원가입");
		         System.out.println("2. 로그인");
		         System.out.println("0. 프로그램 종료");
		         
		         System.out.print("명령을 선택해 주세요:");
		         cmd = in.nextInt();
		         in.nextLine();
		         System.out.println();
		         
		         if(cmd == 0) {
		            System.out.println("프로그램 종료중...");
		            break;
		         }
		         else if(cmd == 1) {
		            while(loopflag) {
		               System.out.println("[회원가입]");
		               System.out.println("1. 일반 회원가입");
		               System.out.println("2. 구글 계정을 사용하여 회원가입");
		               System.out.println("3. 네이버 계정을 사용하여 회원가입");
		               System.out.println("4. 카카오 계정을 사용하여 회원가입");
		               System.out.println("9. 뒤로가기");
		               System.out.println("0. 프로그램 종료");
		               System.out.print("명령을 선택해 주세요 : ");
		               cmd = in.nextInt();
		               in.nextLine();
		               System.out.println();
		            
		               if(cmd == 0) {
		                  System.out.println("프로그램 종료중...");
		                  loopflag = false;
		                  
		               }
		               else if (cmd == 9) {
		                  System.out.println("이전 페이지로 이동 합니다.");
		                  break;
		               }
		               else if (cmd == 1) {
		                  System.out.println("일반 회원가입");
		               }
		               else if (cmd == 2) {
		                  System.out.println("구글 계정을 사용하여 회원가입");
		               }
		               else if (cmd == 3) {
		                  System.out.println("네이버 계정을 사용하여 회원가입");
		               }
		               else if (cmd == 4) {
		                  System.out.println("카카오 계정을 사용하여 회원가입");
		               }
		               else {
		                  System.out.println("오류 : 사용 할 수 없는 명령입니다.");
		               }
		            }
		            System.out.println();
		         }
		         else if(cmd == 2) {
		            while(true) {
		               System.out.println("[로그인]");
		               System.out.println("1. 일반 로그인");
		               System.out.println("2. 구글 계정을 사용하여 로그인");
		               System.out.println("3. 네이버 계정을 사용하여 로그인");
		               System.out.println("4. 카카오 계정을 사용하여 로그인");
		               System.out.println("9. 뒤로가기");
		               System.out.println("0. 프로그램 종료");
		               System.out.print("명령을 선택해 주세요");
		               cmd = in.nextInt();
		               in.nextLine();
		               System.out.println();
		            
		               if(cmd == 0) {
		                  System.out.println("프로그램 종료중...");
		                  break;
		               }
		               else if (cmd == 9) {
		                  System.out.println("이전 페이지로 이동 합니다.");
		                  break;
		               }
		               else if (cmd == 1) {
		                  System.out.println("일반 로그인");
		               }
		               else if (cmd == 2) {
		                  System.out.println("구글 계정을 사용하여 로그인");
		               }
		               else if (cmd == 3) {
		                  System.out.println("네이버 계정을 사용하여 로그인");
		               }
		               else if (cmd == 4) {
		                  System.out.println("카카오 계정을 사용하여 로그인");
		               }
		               else {
		                  System.out.println("오류 : 사용 할 수 없는 명령입니다.");
		               }
		            }
		            in.close();
		         }
		         else {
		            System.out.println("오류 : 사용 할 수 없는 명령입니다.");
		         }
		         System.out.println();
		      }
		      System.out.println("프로그램이 정상적으로 종료 되었습니다.");
		   }

		}