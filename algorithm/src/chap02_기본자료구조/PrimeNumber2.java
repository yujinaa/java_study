package chap02_기본자료구조;
//1000이하의 소수를 열거하기(버전2)
public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter=0;//나눗셈 횟수
		int ptr=0;//찾은소수갯수
		int[] prime = new int[500];//소수 저장할 배열
		
		prime[ptr++] =2;
		
		for(int n=3;n<=1000;n+=2) {
			int i;
			for(i=1;i<ptr;i++) {
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr==i)//마지막까지 나누어떨어지지 않는다면
				prime[ptr++]=n;//소수를 배열에 저장한다
		}
		for(int i=0;i<ptr;i++) {//찾은 ptr개의 소수를 나타낸다
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수 : " +counter);

	}

}
