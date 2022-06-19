package chap01;

import java.util.Scanner;

public class sumForPos {
	//do문 while(제어식);
	//while문이나 for문과 달리 이 구믄의 끝에는 세미콜론을 붙인다

	//Q. 1,2,...,n의 합을 구합니다(양수만 입력)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=1;
		System.out.println("1부터 n까지의 합을 구합니다");

		do {
			System.out.print("n의 값 : ");
			n= input.nextInt();
		}while(n<=0); //n이 0보다 클때까지 반복

		int sum = 0;

		for(int i =1;i<=n;i++) {
			sum +=i;
		}
		System.out.println("1부터 " + n +"까지의 합은 " + sum + "입니다");
	}
}
