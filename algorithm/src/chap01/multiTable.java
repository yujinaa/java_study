package chap01;

public class multiTable {
	//이중 반복문 for
	//이중 반복문으로 곱셈표를 출력하세요

	public static void main(String[] args) {
		System.out.println("----------곱셈표------------");
		for(int i=1; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d",i*j); //적당한 간격(3)으로 출력된다
				//if(i%1==0){
				//System.out.println(i*j +"\t");
			}
			System.out.println();
		}
	}
}