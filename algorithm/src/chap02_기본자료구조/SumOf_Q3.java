package chap02_기본자료구조;

import java.util.Scanner;

//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성하기
public class SumOf_Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i =0;i<a.length;i++) {
			sum += a[i];
		}
		return  (sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("요솟수는? ");
		int num = input.nextInt();

		int[] a  = new int[num];

		for(int i = 0; i<num;i++) {
			System.out.print("a[" +i+ "] :");
			a[i] = input.nextInt();
		}
		System.out.println("배열 a의 모든 요소의 합계는 " + sumOf(a) + "입니다");
	}
}
