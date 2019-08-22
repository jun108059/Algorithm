package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1948] 날짜 계산기
 * 월 일 날짜 2개를 입력받아 D-day 계산기 프로그램
 * 두번째 날짜가 첫번째 날짜보다 항상 크다
 */
public class N1948 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int f_month= scan.nextInt();
			int f_day = scan.nextInt();
			int s_month= scan.nextInt();
			int s_day = scan.nextInt();
			int sol = 0; // 정답
			if (f_month == s_month) {
				sol = s_day - f_day + 1;
				System.out.println("#" + test_case + " " + sol);
				continue;
			}
			sol += s_day;
			do {
				s_month --;
				if (s_month == 1 || s_month == 3 || s_month == 5 || s_month == 7 || s_month == 8 || s_month == 10) {
					sol += 31;
				}else if (s_month == 2) {
					sol += 28;
				}else {
					sol += 30;
				}
			} while (f_month != s_month);
			sol = sol - f_day + 1;
			System.out.println("#" + test_case + " " + sol);
		}
		scan.close();
	}
}
