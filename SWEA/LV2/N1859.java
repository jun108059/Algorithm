package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [1859] 백만 장자 프로젝트
 * 연속된 N일 동안의 매매가를 예측
 * 구입 후 판매해서 얻는 최대 이익 출력
 */


public class N1859 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt(); // test case 수 입력
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			long sol = 0; // 최종 답
			long max = 0; // 각 price의 최대 이익
			int predict_day = scan.nextInt(); // 예측할 수 있는 day
			int[] price = new int[predict_day];
			for (int day = 0; day < predict_day; day++) { // Input data 배열에 삽입
				price[day] = scan.nextInt();
			}
			// 이중 for문을 줄여야 할 듯
			// time out 뜨는 것 같음
			for (int day = 0; day < predict_day; day++) {
				max = 0;
				for (int index = day+1; index < predict_day; index++) {
					if (max < (long)(price[index] - price[day])) max = (long)(price[index] - price[day]);
				}
				sol += max;
			}
			System.out.println("#" + test_case + " " + sol);
		}
		scan.close();
	}
}
