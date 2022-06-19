package chap01;

import java.util.Scanner;

public class spira {
	//n단의 피라미드를 출력하는 메서드를 작성하세요

	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) { 		// n-i+1개의 ' '를 나타낸다
				System.out.print(' ');
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) { 	// (i-1)*2+1개의 '*'를 나타낸다
				System.out.print('*');
			}
			System.out.println(); 						// 개행(줄변환)
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("몇 단 피라미드입니까? : ");
		n = input.nextInt();
		spira(n);
	}
}
