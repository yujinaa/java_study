package chap02_기본자료구조;

import java.util.Scanner;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력 분포 구하기
public class PhysicalExamination {
	static final int vmax= 21; //시력분포는 0.0에서 0.1단위로 21개라고 한다)

	static class physcData{
		String name;
		int height;
		double vision;

		//생성자 만들기
		physcData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	//키의 평균값 구하기
	static double averHeight(physcData[] data) {
		double sum = 0;
		
		for(int i = 0; i<data.length; i++) {
			sum += data[i].height;			
		}
		return sum / data.length;
	}
	
	//시력 분포구하기
	static void distVision(physcData[] data, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for(i=0;i<data.length;i++) {
			if(data[i].vision >= 0.0 && data[i].vision <= vmax /10.0) {
				dist[(int)data[i].vision*10]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		physcData[] x= {
				new physcData("박현규", 162, 0.3),
				new physcData("함진아", 173, 0.7),
				new physcData("최윤미", 175, 2.0),
				new physcData("홍연의", 171, 1.5),
				new physcData("이수진", 168, 0.4),
				new physcData("김영준", 174, 1.2),
				new physcData("박용규", 169, 0.8),
		};
		int[] vdist = new int[vmax];
		
		System.out.println("신체검사 리스트");
		System.out.println("이름      키  시력");
		System.out.println("----------------");
		
		for(int i = 0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n평균키 : %5.1fcm\n", averHeight(x));
		
		distVision(x, vdist);//시력분포 구하기
		
		System.out.println("\n시력 분포");
		for(int i = 0; i<vmax;i++) {
			System.out.printf("%3.1f~:%2d명\n", i/10.0, vdist[i]);
		}
		
	}
}
