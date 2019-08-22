package lv2;

import java.util.Scanner;
/* 19.08.20
 * SW Expert Academy
 * [1970] 쉬운 거스름돈
 * 돈을 최소 개수만 거슬러 주기위해 큰 화폐 먼저 거슬러주는 프로그램
 */
public class N1970 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int price = scan.nextInt();
			int [] money = new int[8];
			while (price >= 10) {
				if (price >= 50000) {
					price -= 50000;
					money[0]++;
				}
				else if (price >= 10000) {
					price -= 10000;
					money[1]++;
				}
				else if (price >= 5000) {
					price -= 5000;
					money[2]++;
				}
				else if (price >= 1000) {
					price -= 1000;
					money[3]++;
				}
				else if (price >= 500) {
					price -= 500;
					money[4]++;
				}
				else if (price >= 100) {
					price -= 100;
					money[5]++;
				}
				else if (price >= 50) {
					price -= 50;
					money[6]++;
				}
				else if (price >= 10) {
					price -= 10;
					money[7]++;
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < money.length; i++) {
				System.out.print(money[i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
