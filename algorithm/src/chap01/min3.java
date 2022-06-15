package chap01;

public class min3 {
	//Q2. 세 값의 최솟값을 구하는 min3메서드를 작성하세요

	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;

		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(1,2,3) = " +min3(1,2,3));
		System.out.println("min3(9,3,5) = " +min3(9,3,5));
		System.out.println("min3(7,6,5) = " +min3(7,6,5));
	}
}

