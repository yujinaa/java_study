package chap01;

import java.util.Scanner;

public class max3 {
		//세 값의 최댓값
		//3개의 정숫값을 입력하고 최댓값을 구합니다.
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a,b,c;

			System.out.println("세 정수의 최댓값을 구합니다");
			System.out.println("a의 값: ");
			a= input.nextInt();
			System.out.println("b의 값: ");
			b= input.nextInt();
			System.out.println("c의 값: ");
			c= input.nextInt();

			int max = a;
			if(b>max) {
				max=b;
			}if(c>max) {
				max=c;
			}
			System.out.println("최댓값은 " + max + "입니다");
		}
	}
