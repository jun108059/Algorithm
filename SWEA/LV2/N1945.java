package lv2;
import java.util.Scanner;
/* 19.08.20
 * SW Expert Academy
 * [1945] 간단한 소인수분해
 * 2 3 5 7 11 로 소인수 분해 하라
 */
public class N1945 {
	static final int factor = 5;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int num = scan.nextInt();
			int[] factors = new int[factor];
			while(num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
					factors[0]++;
				}
				else if (num % 3 == 0) {
					num = num / 3;
					factors[1]++;
				}
				else if (num % 5 == 0) {
					num = num / 5;
					factors[2]++;
				}
				else if (num % 7 == 0) {
					num = num / 7;
					factors[3]++;
				}
				else if (num % 11 == 0) {
					num = num / 11;
					factors[4]++;
				}
				else break;
			}
			System.out.print("#" + test_case);
			for (int i = 0; i < factors.length; i++) {
				System.out.print(" " + factors[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}