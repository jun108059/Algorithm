package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1966] 숫자를 정렬하자
 * 오름차순 정렬
 */
public class N1966 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case 만큼 Loop
			int number = scan.nextInt();
			int[] sort_Arr = new int[number];
			for(int i = 0; i < number; i++) {
				sort_Arr[i] = scan.nextInt();
			}
			for(int i = 0; i < number; i++) {
				for(int k = i; k < number; k++) {
					if(sort_Arr[i] > sort_Arr[k]) {
						int temp = sort_Arr[i];
						sort_Arr[i] = sort_Arr[k];
						sort_Arr[k] = temp;
					}
				}
			}
			System.out.print("#" + test_case);
			for(int i = 0; i < number; i++) {
				System.out.print(" " + sort_Arr[i]);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
