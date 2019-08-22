package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1984] 중간 평균값 구하기
 * 10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 
 * 나머지의 평균값을 출력하는 프로그램
 */

// sort -> 첫번째 마지막 배열 제외한 나머지 평균
public class N1984 {
	static final int input_num = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int [] num_arr = new int[input_num];
			for (int i = 0; i < input_num; i++) {
				num_arr[i] = scan.nextInt(); // 배열에 숫자 넣기
			}
			// sorting
			for (int i = 0; i < num_arr.length; i++) {
				int temp = 0;
				for (int k = i; k < num_arr.length; k++) {
					if (num_arr[i] > num_arr[k]) {
						temp = num_arr[k];
						num_arr[k] = num_arr[i];
						num_arr[i] = temp;
					}
				}
			}
			// 최대 최소 제외한 평균 구하기
			double sol = 0;
			for (int i = 1; i < num_arr.length-1; i++) {
				sol += (double)num_arr[i];
			}
			sol = sol/8;
			System.out.println("#" + test_case + " " + Math.round(sol));
		}
		scan.close();
	}
}
