package chap02_기본자료구조;

import java.util.Scanner;

//그 해 경과 일수 구하기
public class DayOfYear {
	//각 달의 일수
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},//평년
			{31,29,31,30,31,30,31,31,30,31,30,31} //윤년
	};
	//윤년은 1 , 평년은 0
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400==0)?1:0;
	}

	//y년 m월 d일의 해 경과 일수 구하기
	static int dayOfYear(int y, int m , int d) {
		int days = d; //일수

		for(int i =1; i<m;i++)//1~(m-1)월의 일수 더하기
			days += mdays[isLeap(y)][i-1];
		return days;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int retry;

		System.out.println("그 해 경과 일수 구하기");

		do {
			System.out.println("년 : ") ;int year = input.nextInt(); //년
			System.out.println("월 : ") ;int month = input.nextInt(); //월
			System.out.println("일 : ") ;int day= input.nextInt(); //일

			System.out.printf("그 해 %d일째\n", dayOfYear(year, month, day));

			System.out.print("한번더?(1.yes/2.no) : ");
			retry = input.nextInt();
		}while(retry==1);
	}
}
