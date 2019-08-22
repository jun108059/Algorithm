package lv2;

import java.util.Scanner;

/* 19.08.14
 * SW Expert Academy
 * [1976] 시각 덧셈
 * 시 분으로 이루어진 시각을 2개 입력 받아, 더한 값을 시 분으로 출력하는 프로그램을 작성하라.
 * (시각은 12시간제로 표시한다. 즉, 시가 가질 수 있는 값은 1시부터 12시이다.)
 */

public class N1976 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case 수 입력

		for (int test_case = 1; test_case < test+1; test_case++) { // test case 만큼 Loop
			int first_H = scan.nextInt();
			int first_M = scan.nextInt();
			int second_H = scan.nextInt();
			int second_M = scan.nextInt();
			
			int sum_H = first_H + second_H;
			int sum_M = first_M + second_M;
			
			
			if (sum_M >= 60) {
				sum_H++;
				sum_M -= 60; 
			}
			if (sum_H >= 13) {
				sum_H -= 12;
			}
			System.out.println("#" + test_case + " " + sum_H + " " + sum_M);
		}
	}
}
