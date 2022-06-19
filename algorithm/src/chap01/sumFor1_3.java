package chap01;

import java.util.Scanner;

public class sumFor1_3 {

	//Q1. 1 ~ 10까지의 합을 구하는 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("1부터 10까지의 합을 구합니다");
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 = " + sum);
	}

}
