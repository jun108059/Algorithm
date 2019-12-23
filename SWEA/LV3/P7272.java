package d3;

import java.util.Scanner;

/* 19.12.24
 * SW Expert Academy
 * [7272] 안경이 없어
 * 문자열을 문자 단위로 구별할 수는 있지만, 두 문자가 정확히 같은 지는 알지 못한다.
 * 특히 알파벳 대문자 같은 경우 문자에 나 있는 구멍의 개수가 같으면 같은 문자이고, 다르면 다른 문자라고 생각한다.
 * 알파벳 대문자로 이루어진 두 문자열이 주어졌을 때, 경근이는 두 문자열이 같다고 판별하는지 다르다고 판별할 것인가?
 */

public class P7272 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case 수 입력
		for (int test_case = 1; test_case < test+1; test_case++) { // test case 만큼 Loop
			String first_str = scan.next();
			String second_str = scan.next();
			String first_final = "";
			String second_final = "";
			for(int i = 0; i<first_str.length(); i++) {
				if(first_str.charAt(i) == 'A' || first_str.charAt(i) == 'D' || first_str.charAt(i) == 'O' || first_str.charAt(i) == 'P' || first_str.charAt(i) == 'Q' || first_str.charAt(i) == 'R') {
					first_final = first_final.concat("A");
				}
				else if(first_str.charAt(i) == 'B') {
					first_final = first_final.concat("B");
				}
				else {
					first_final = first_final.concat("C");
				}
			}
			for(int i = 0; i<second_str.length(); i++) {
				if(second_str.charAt(i) == 'A' || second_str.charAt(i) == 'D' || second_str.charAt(i) == 'O' || second_str.charAt(i) == 'P' || second_str.charAt(i) == 'Q' || second_str.charAt(i) == 'R') {
					second_final = second_final.concat("A");
				}
				else if(second_str.charAt(i) == 'B') {
					second_final = second_final.concat("B");
				}
				else {
					second_final = second_final.concat("C");
				}
			}
			
			if(first_final.equals(second_final)) {
				System.out.println("#" + test_case + " SAME");
			}
			else {
				System.out.println("#" + test_case + " DIFF");
			}
		}
	scan.close();
	}
	
}




