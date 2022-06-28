package chap02_기본자료구조;

import java.util.Scanner;

//배열 요소에 값을 읽어 들여 역순으로 정렬하기
public class ReverseArray {
	//역순으로 정렬하려면 배열 요소의 값 idx1과 idx2를 바꿔준다
	static void swap(int[] a, int idx1, int idx2) {
		int change = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2]=change;
	}
	
	//바꾼 배열 a의 요소를 역순으로 정렬한다
	static void reverse(int[] a) {
		for(int i =0;i<a.length/2;i++) {
			swap(a, i, a.length -i -1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = input.nextInt();
		
		int[] array = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "] : ");
			array[i] = input.nextInt();
		}
		reverse(array); //배열 a의 요소들을 역순으로 정렬한다
		
		System.out.println("요소를 역순으로 정렬합니다");
		for(int i =0; i<num;i++) {
			System.out.println("x[" + i + "] = " + array[i]);
		}

	}

}
