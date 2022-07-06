package chap02_기본자료구조;
//확장 for문
//배열의 모든 요소의 합을 구해 출력해라
public class ArraySumForIn {

	public static void main(String[] args) {
		double[] d = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0;i<d.length;i++) {
			System.out.println("d[" + i + "]=" + d[i]);
			
		}
		double sum = 0;
		for(double i : d) {
			sum +=i;
		}
		System.out.println("모든 요소의 합은 " + sum + "입니다");
	}

}
