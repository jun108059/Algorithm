package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1959] 두 개의 숫자열
 * 각각 N, M개의 숫자로 구성된 숫자열 2개
 * 각 숫자 배열의 곱이 최대인 경우
 */
public class N1959 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int a_size = scan.nextInt();
			int b_size = scan.nextInt();
			int sol = 0; // 정답
			int sum = 0; // 중간 합
			int sub_size = 0;
			String move = "";
			if (a_size < b_size) {
				sub_size = b_size - a_size;
				move = "first";
			}else{
				sub_size = a_size - b_size;
				move = "second";
			}
			int[] a_num = new int[a_size];
			int[] b_num = new int[b_size];
			
			// 배열 할당
			for(int i = 0; i < a_size; i++) {
				a_num[i] = scan.nextInt();
			}
			for(int i = 0; i < b_size; i++) {
				b_num[i] = scan.nextInt();
			}
			for(int i = 0; i <= sub_size; i++) { // 시작점
				sum = 0;
				if (move == "first") { // 첫번째 숫자열 size가 작을경우
					for(int k = 0; k < a_size; k++) {
						sum += a_num[k] * b_num[i+k];
					}
				}
				else if (move == "second") { // 두번째 숫자열 size가 작을경우
					for(int k = 0; k < b_size; k++) {
						sum += a_num[i+k] * b_num[k];
					}
				}
				if(sol < sum) sol = sum; // 큰 값 넣기
			}
			System.out.println("#" + test_case + " " + sol);
		}
		scan.close();
	}
}
