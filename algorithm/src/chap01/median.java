package chap01;

import java.util.Scanner;

public class median {
	//세 값의 중앙값 : 최댓값, 최솟값과 달리 구하는 절차는 매우 복잡해 수많은 알고리즘을 생각 할 수 있다
	//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다

	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("세 정수의 중앙값을 구합니다");
		System.out.print("a의 값 : ");
		a = input.nextInt();
		System.out.print("b의 값 : ");
		b = input.nextInt();
		System.out.print("c의 값 : ");
		c = input.nextInt();

		System.out.println("중앙값은 " + med3(a,b,c));
	}
}
