package chap01;

import java.util.Scanner;

public class sumForPos1_2 {
	/*두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
 	단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a의 값  :");
		int a = input.nextInt();
		int b = 0;
		while(true) {
			System.out.println("b의 값 : ");
			b = input.nextInt();
			if(a>b) 
				break;
			System.out.println("a보다 큰 값 입력하기!");
		}
		System.out.println("b-a는 " + (b-a) + "입니다");
	}
}
