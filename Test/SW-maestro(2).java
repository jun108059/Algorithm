import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class P2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = sc.nextInt(); // N명
		int relation = sc.nextInt(); // M관계

		int[][] tableN = new int[number][2]; // N명 2차원 배열 선언
		int[][] tableR = new int[relation][2]; // M관계 2차원 배열 선언
		// 2개 짜리 배열이 N개 
		// 값 할당
		for (int i = 0; i < tableN.length; i++) {
			tableN[i][0] = sc.nextInt();
			tableN[i][1] = sc.nextInt();
		}
		String compare  = "";
		for (int i = 0; i < relation; i++) {
			tableR[i][0] = sc.nextInt();
			tableR[i][1] = sc.nextInt();
			// 정렬하기 위한 swap
			if(tableR[i][0] > tableR[i][1]) {
				int temp = tableR[i][0];
				tableR[i][0] = tableR[i][1];
				tableR[i][1] = temp;
			}
			compare = compare + Integer.toString(tableR[i][0]);
			compare = compare + Integer.toString(tableR[i][1]) + " ";
		}
		
//		System.out.println(compare);

//		wr.write(); 
		wr.flush(); 
		wr.close();
		sc.close();

	}

}
