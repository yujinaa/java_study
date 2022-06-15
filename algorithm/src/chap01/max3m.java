package chap01;

public class max3m {
	//여러 값에 대한 최댓값
	//3개의 정숫값 가운데 최댓값을 구하여 출력
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) {
			max=b;
		}if(c>max) {
			max=c;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,6,7) = " + max3(3,6,7));
	}
}
