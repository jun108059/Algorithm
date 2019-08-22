package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [2007] 패턴 마디의 길이
 * 반복되는 부분을 마디 -> 마디의 길이를 출력
 */

public class N2007 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			String str = scan.next();
			for (int i = 1; i <= 10; i++) { // Input data 배열에 삽입
				String pre = str.substring(0, i); // 앞에서 두개 추출
				String next = str.substring(i, i + i);
				if (pre.equals(next)) {
					System.out.println("#" + test_case + " " + pre.length());
					break;
				}
				if (i == 1) { // 마디가 한 개인 경우 예외처리
					pre = str.substring(0, 1);
					next = str.substring(1, 2);
					if (pre.equals(next)) {
						System.out.println("#" + test_case + " " + "1");
						break;
					}
				}
			}
		}
		scan.close();
	}
}

