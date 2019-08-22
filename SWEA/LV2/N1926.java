package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [1926] 간단한 369게임
 * 3 6 9 에서는 - 로 출력
 */

public class N1926 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String change = "";
		String sol = "";
		int total = scan.nextInt();
		for (int count = 1; count <= total; count++) {
			change = Integer.toString(count);
			
			if(change.contains("3") || change.contains("6") || change.contains("9")) {				
				String [] count369 = change.split("");
				change = "";
				for(int i = 0; i<count369.length; i++) {
					if (count369[i].equals("3") || count369[i].equals("6") || count369[i].equals("9")) {
						change = change.concat("-");
					}
				}
//				change = change.replaceAll("3", "-");
//				change = change.replaceAll("6", "-");
//				change = change.replaceAll("9", "-");
			}
			if(count == total) {
				sol = sol.concat(change);
				break;
			}
			sol = sol.concat(change + " ");
		}
		System.out.print(sol);
		scan.close();
	}
}
