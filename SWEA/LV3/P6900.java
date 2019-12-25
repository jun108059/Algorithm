package d3;

import java.util.Scanner;

public class P6900{
	static final int base_num = 8;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();

		// test case
		for(int i = 1; i <= test; i++) {
			int sum_price = 0;
			int count = 0;
			int winNumCount = scan.nextInt();
			int myNumCount = scan.nextInt();
			// key value로 map 쓰고 싶은데 잘 모름 공부해야될 듯
			String [][] winNum_Price = new String[winNumCount][2];
			String [] myNumArr = new String[myNumCount];
			for(int k = 0; k < winNumCount; k++) {
				String winNum = scan.next();
				String price = scan.next();
				winNum_Price[k][0] = winNum;
				winNum_Price[k][1] = price;
			}
			for(int k = 0; k < myNumCount; k++) {
				String myNum = scan.next();
				myNumArr[k] = myNum;
			}
			// [4] 내 고유번호 만큼 loop
			for(int k = 0; k < myNumCount; k++) {
				char[] compare_Mine = myNumArr[k].toCharArray();			// 고유번호를 char 배열로 바꿔줌
//				 [4] 고유번호 하나와 당첨번호 비교하는 loop
				for (int l = 0; l < winNumCount; l++) {
					char[] compare_Win = winNum_Price[l][0].toCharArray(); 	// 당첨번호를 char 배열로 바꿔줌
//					 [8] 8자리 순환 loop
					for (int j = 0; j < base_num; j++) {
//						 당첨번호 l번째 자리가 *이 아니면서 고유번호 l번쨰과 같지 않을 때
						if (compare_Win[j] != '*' && (compare_Win[j] != compare_Mine[j])) {
							break;
						}
						count++;
					}
					if(count == 8) {
						sum_price += Integer.parseInt(winNum_Price[l][1]);
					}
					count = 0;
				}
			}
			System.out.println("#" + i + " " + sum_price);
		}
		scan.close();
	}
}
