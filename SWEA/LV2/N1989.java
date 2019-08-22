package lv2;

import java.util.Scanner;

/*
 * SW Expert Academy
 * [1989] 초심자의 회문 검사
 * "level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(palindrome)이라 한다.
 * 단어를 입력 받아 회문이면 1을 출력하고, 아니라면 0을 출력하는 프로그램을 작성
 */

public class N1989 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sol = 1;
		Scanner scan = new Scanner(System.in);
		int testcount = scan.nextInt();
		// 입력받은 test case만큼 배열 생성
		// 배열에 단어들 넣기
		String [] wordArr = new String[testcount];
		for(int i=0; i<testcount; i++) {
			wordArr[i] = scan.next();
		}
		for(int i=0; i<testcount; i++) {
			int wordLeng= wordArr[i].length();
			// 홀수일 때만 비교하면 됨
			for(int k=0; k<((wordLeng/2)); k++) {
				// 배열에 문자열 길이 /2 만큼 확인
				if (!(wordArr[i].substring(k,k+1).equals(wordArr[i].substring(wordLeng-k-1,wordLeng-k)))) {
					sol = 0;
					break;
				}
			}
			System.out.println("#"+ (i+1) + " " + sol);
			sol = 1;
		}
	}
}
