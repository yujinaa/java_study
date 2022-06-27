package chap02_기본자료구조;

import java.util.Random;
import java.util.Scanner;

//난수 사용해 배열의 요솟값 설정하기
//배열 요소의 최댓값을 나타냅니다(값을 난수로 생성)
public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random random = new Random(); //난수 사용을 위해 random클래스 사용
		Scanner input = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구하세요");
		System.out.print("사람 수 : ");
		int num = input.nextInt(); //베열의 요솟수를 입력 받는다
		
		int[]height = new int[num];//요솟수가 num인 배열 생성하기
		System.out.println("키 값은 아래와 같습니다.");
		for(int i =0; i<num;i++) {
			height[i] = 100 + random.nextInt(100); //요소의 값을 난수로 결정한다
			System.out.println("height[" + i + "] : " +height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "입니다");
	}

}
