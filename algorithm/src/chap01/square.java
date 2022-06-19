package chap01;

import java.util.Scanner;

public class square {
	//오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("사각형을 출력합니다");
		System.out.print("단수 : ");
		n = input.nextInt();

		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
