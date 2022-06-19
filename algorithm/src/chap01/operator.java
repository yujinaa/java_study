package chap01;

public class operator {
	/*연산자와 피연산자
	-연산자 : +,- 등의 연산 기호
	-피연산자 : 연산의 대상이 되는 것

	ex) a>b 
		-연산자는 >
		-피연산자는 a,b

	종류
	-단항 연산자 : 피연산자 한개
	-2항 연산자 : 피연산자 2개
	-3항 연산자 : 피연산자 3개
		-> 표현방법 : a ? b : c  --> a가 true이면 b를 반환하고, false이면 c를 반환
	 */

	public static void main(String[] args) {
		//3항 연산자
		System.out.println((2==0) ? "2는 0" : "2는 0이 아니다");
		System.out.println((5!=3) ? "5는 3이 아니다" : "5는 3이 맞다");

	}

}
