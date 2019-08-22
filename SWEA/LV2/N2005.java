package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [2005] 파스칼의 삼각형
 * 좌측상단, 우측상단 합 출력되는 삼각형
 */

public class N2005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int line = scan.nextInt();
			System.out.println("#" + test_case);
			int size = 0;
			// 사이즈 정해주기
			
			for (int i=1; i<=line; i++) {
				size += i;
			}
			int [] paskal = new int[size];
			int count = 0;
			// line 시작 자리 1로 초기화
			for (int num_one = 0; num_one<paskal.length;) {
				count++;
				paskal[num_one] = 1;
				num_one += count;
			}
			// line 끝 자리 1로 초기화
			count = 2;
			for (int num_one = 2; num_one<paskal.length;) {
				count++;
				paskal[num_one] = 1;
				num_one += count;
			}
			count = 3;
			int new_count = 3;
			// 가운데 채우기
			for (int num_one = 4; num_one<paskal.length;) {
				int k = count;
				do{
					paskal[num_one] = paskal[num_one-new_count] + paskal[num_one-new_count+1];
					num_one++;
					k--;
				}while(!(k == 2));
				num_one = num_one+2;
				if (num_one >= paskal.length) {
					break;
				}
				paskal[num_one] = paskal[num_one-new_count] + paskal[num_one-new_count+1];
				new_count++;
				count++;
			}
			int line_count = 1;
			int num_count = 1;
			// 파스칼 삼각형 프린트 찍기
			for (int i = 0; i<paskal.length; i++) {
				System.out.print(paskal[i] + " ");
				if (line_count == num_count) {
					System.out.println();
					line_count++;
					num_count = 0;
				}
				num_count++;
			}
		}
		scan.close();
	}
}
