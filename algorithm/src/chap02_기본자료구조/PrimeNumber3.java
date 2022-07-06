package chap02_기본자료구조;

//1000이하의 소수 열거하기(버전3)
public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0;//곱셈, 나눗셈 횟수
		int ptr = 0;//찾은 소수 개수
		int[] prime = new int[500];//소수 저장하는 배열
		
		prime[ptr++] =2; //2는 소수이기 때문
		prime[ptr++] = 3;//3도 소수이기 때문
		
		for(int n=5;n<=1000;n+=2) {//홀수만 포함
			boolean flag = false;
			for(int i = 1;prime[i] * prime[i] <=n;i++) {
				counter +=2;
				if(n % prime[i]==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		for(int i = 0;i<ptr;i++)
			System.out.println(prime[i]);//찾은 ptr개 소수 출력
		
		System.out.println("곱셈과 나누셈을 수행한 횟수 : " + counter);
	}
}
