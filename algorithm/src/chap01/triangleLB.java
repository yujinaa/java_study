package chap01;

import java.util.Scanner;

public class triangleLB {
	//이중 반복문을 이용한 직각 이등변 삼각형 출력
	//Q. 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Q.왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		System.out.print("몇 단 삼각형입니까? : ");
		n = input.nextInt();

		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
