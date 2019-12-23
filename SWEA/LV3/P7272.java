package d3;

import java.util.Scanner;

/* 19.12.24
 * SW Expert Academy
 * [7272] �Ȱ��� ����
 * ���ڿ��� ���� ������ ������ ���� ������, �� ���ڰ� ��Ȯ�� ���� ���� ���� ���Ѵ�.
 * Ư�� ���ĺ� �빮�� ���� ��� ���ڿ� �� �ִ� ������ ������ ������ ���� �����̰�, �ٸ��� �ٸ� ���ڶ�� �����Ѵ�.
 * ���ĺ� �빮�ڷ� �̷���� �� ���ڿ��� �־����� ��, ����̴� �� ���ڿ��� ���ٰ� �Ǻ��ϴ��� �ٸ��ٰ� �Ǻ��� ���ΰ�?
 */

public class P7272 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case �� �Է�
		for (int test_case = 1; test_case < test+1; test_case++) { // test case ��ŭ Loop
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




