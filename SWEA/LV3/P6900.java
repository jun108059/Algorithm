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
			// key value�� map ���� ������ �� �� �����ؾߵ� ��
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
			// [4] �� ������ȣ ��ŭ loop
			for(int k = 0; k < myNumCount; k++) {
				char[] compare_Mine = myNumArr[k].toCharArray();			// ������ȣ�� char �迭�� �ٲ���
//				 [4] ������ȣ �ϳ��� ��÷��ȣ ���ϴ� loop
				for (int l = 0; l < winNumCount; l++) {
					char[] compare_Win = winNum_Price[l][0].toCharArray(); 	// ��÷��ȣ�� char �迭�� �ٲ���
//					 [8] 8�ڸ� ��ȯ loop
					for (int j = 0; j < base_num; j++) {
//						 ��÷��ȣ l��° �ڸ��� *�� �ƴϸ鼭 ������ȣ l������ ���� ���� ��
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
