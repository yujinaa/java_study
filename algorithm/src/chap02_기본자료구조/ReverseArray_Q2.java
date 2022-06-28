package chap02_기본자료구조;

import java.util.Scanner;

//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 작성하기
public class ReverseArray_Q2 {

	//배열 요소값 교환하기
	static void swap(int[] a, int idx1, int idx2) {
		int change = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = change;
	}
	//배열 a의 요소값 나타내기
	static void print(int[] a ) {
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i] + " ");
			System.out.println();
		}
	}

	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for(int i =0; i<a.length/2;i++) {
			System.out.println("a[" +i +"]와 " +(a.length-i-1)+"]를 교환");
			swap(a, i, a.length-i-1);
			print(a);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("요솟수는 ：");
		int num = input.nextInt();

		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = input.nextInt();
		}
		reverse(array);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}