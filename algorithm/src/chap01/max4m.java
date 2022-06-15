package chap01;

public class max4m {
	//Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) {
			max=b;
		}if(c>max) {
			max=c;
		}if(d>max) {
			max = d;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println("max4(2,5,7,8) = " + max4(2,5,7,8));
		System.out.println("max4(7,2,5,9) = " + max4(7,2,5,9));
	}
}
