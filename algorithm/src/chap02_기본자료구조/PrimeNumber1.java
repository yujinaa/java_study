package chap02_기본자료구조;
//1000이하의 소수를 열거하기(버전1)
public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		
		for(int num = 2; num<=1000; num++) {
			int i;
			for(i =2;i<num;i++) {
				counter++;
				if(num % i ==0) {//나누어떨어지면 소수가 아니다
					break;  //그럴경우 반복문 빠져나오기
				}
			}
			if(num==i) {//마지막까지 나누어떨어지지 않을 경우
				System.out.println(num);
			}
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}

}
