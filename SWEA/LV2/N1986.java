package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1986] 지그재그 숫자
 * 1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값
 */
public class N1986 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int number = scan.nextInt();
			int sol = 0;
			for(int i = 1; i <= number; i++) {
				if(i%2 == 0) { // 짝수 일 경우 빼기
					sol -= i;
				}
				else {
					sol += i;
				}
			}
			System.out.println("#" + test_case + " " + sol);
		}
		
		scan.close();
	}
}
