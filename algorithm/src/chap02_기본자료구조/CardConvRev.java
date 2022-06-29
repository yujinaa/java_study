package chap02_기본자료구조;

//입력 받은 10진수를 2진수 ~ 36진수로 기수 변환해 나타내기
public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {//정숫값 x를 r로 변환해 배열 d에 아랫자리부터 넣어두고 자릿수 반환하기
		int digits = 0;//변환 후 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);//r로 나눈 나머지를 저장한다
			x/=r;
		}while(x!=0);
		return digits;
	}
}
