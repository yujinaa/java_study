package chap01;

import java.util.Scanner;

public class sumWhile {
	/*반복
 	-1.while문 : 어떤 조건이 성립하는 동안 처리를 반복해 실행
 	  -> while(제어식) 명령문
	 */

	//1부터 n까지의 정수 합 구하기 
	//Q. 1,2, ... n의 합을 구합니다
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int i = 1;//반복을 제어하기 위한 변수 초기화 
		int sum=0; //합을 저장하는 변수 초기화
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.println("n의 값 : ");
		n = input.nextInt();

		//while을 이용한 반복
		while(i<=n) {
			sum+=i;
			i++;
		}System.out.println("1부터 " + n + "까지의 합은 "+ sum + "입니다");
		/* for을 이용한 반복
		for(i=1; i<=n;i++) {
			sum += i; 
		}
		System.out.println("1부터 " + n+"까지의 합은 " + sum + "입니다.");
		 */
	}
}
