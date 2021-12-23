package exam;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 연도를 입력받아 윤년을 판별하는 프로그램을 작성하시오.
		//	윤년의 조건
		//	- 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		//    4로 나누어 떨어지지만 100으로도 나누어 떨어지는 해는 평년으로 한다.
		//	  단, 400으로 나우어 떨어지는 해는 윤년으로 한다.(예 : 2000년, 2400년)
		
		System.out.print("Enter year : ");
		int year = scan.nextInt();
		String answer = "Common year";
		if(year % 4 == 0) {
			answer = "Leap year";
			if(year % 400 == 0) {
				answer = "Leap year";
			}else if(year % 100 == 0) {
				answer ="Common year";
			}	
		} 
		System.out.println(answer);
		
		scan.close();
	}

}
