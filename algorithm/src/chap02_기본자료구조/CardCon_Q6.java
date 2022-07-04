package chap02_기본자료구조;

import java.util.Scanner;

//배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드 작성하기
public class CardCon_Q6 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; //변환 뒤의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] =dchar.charAt(x % r);
			x /= r;
		}while(x !=0);

		for(int i =0;i<digits /2; i++) {
			char temp = d[i];
			d[i] = d[digits -i -1];
			d[digits -i -1] = temp;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num; //변환하는 정수
		int cd; //기수
		int dnum;//변환 후의 자릿수
		int retry; 
		char[] cnum = new char[32]; 
		
		System.out.println("10진수를 기수변환하기");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				num = input.nextInt();
			}while(num <0);
		do {
			System.out.println("어떤 진수로 변환?");
			cd = input.nextInt();
		}while(cd<2 || cd >36);
		
		dnum = cardConv(num, cd, cnum); //num을 cd진수로 변환한다
		System.out.println(cd + "진수로는");
		for (int i = 0; i < dnum; i++) // 윗자리부터 차례로 나타냄
			System.out.print(cnum[i]);
		System.out.println("입니다.");
		
		System.out.println("한번더? 1.yes 2.no");
		retry = input.nextInt();
		}while(retry==1);
	}

}
