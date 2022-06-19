package chap01;

import java.util.Scanner;

public class sumFor1_2 {
	//Q1. n = 7이면 1+2+3+4+5+6+7=28로 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("1부터 7까지의 합 구하기");
		System.out.println("n의 값 : ");
		n = input.nextInt();
		
		for(int i = 1; i<=7 ; i++) {
			sum += i;
		}
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 = " + sum);

	}

}
