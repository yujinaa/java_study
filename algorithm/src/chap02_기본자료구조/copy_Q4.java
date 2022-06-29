package chap02_기본자료구조;

import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성해라
public class copy_Q4 {
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i<num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("a의 요솟수는 : ");
		int num1 = input.nextInt();
		int[] a = new int[num1];
		
		for(int i =0; i<num1;i++) {
			System.out.print("a[" + i + "] :");
			a[i] = input.nextInt();
		}
		
		System.out.print("b의 요솟수는 : ");
		int num2 = input.nextInt();
		int[] b= new int[num2];
		
		for(int i =0; i<num2;i++) {
			System.out.print("a[" + i + "] :");
			b[i] = input.nextInt();
		}
		
		copy(a, b); //배열 b의 모든 요소를 배열 a에 복사한다
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사합니다");
		for(int i = 0 ; i<num1;i++) {
			System.out.println("a[" + i + "] = " +a[i] );
		}

	}

}
