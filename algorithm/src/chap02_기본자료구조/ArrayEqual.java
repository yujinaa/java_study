package chap02_기본자료구조;

import java.util.Scanner;


//두 배열이 같은가를 판단해보자
public class ArrayEqual {
	static boolean eqauls(int[] a, int[] b) {
		if(a.length != b.length) 
			return false;

		for(int i =0;i<a.length;i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("배열 a의 요솟수 : ");
		int num1 = input.nextInt();

		int[] a = new int[num1];

		for(int i =0; i<num1;i++) {
			System.out.print("a[" + i + "] : " );
			a[i] = input.nextInt();
		}

		System.out.print("배열 b의 욧소수 :"); 
		int num2 = input.nextInt();

		int[] b = new int[num2];

		for(int i =0; i<num2;i++) {
			System.out.print("b[" + i + "] :");
			b[i] = input.nextInt();
		}

		System.out.println("배열 a와 b는 " + (eqauls(a,b) ? "같습니다" : "같지 않습니다"));

	}
}
