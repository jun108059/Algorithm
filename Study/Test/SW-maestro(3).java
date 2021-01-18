import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		int total_size = sc.nextInt();
		int[] start = new int[total_size];
		int[] end = new int[total_size];
		int[] comp_start = new int[total_size];
		int[] comp_end = new int[total_size];
		
		int[] count = new int[total_size];
		for(int i = 0; i < total_size; i++) {
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
			comp_start[i] = start[i];
			comp_end[i] = end[i];
		}
		
		for(int i = 0; i < start.length; i++) { 
			for(int j = 0; j < end.length; j++) {
				if(start[i] <= start[j]) { // s2 가 크거나 같음
					// pass
					continue;
				}
				else if(start[i] >= end[j]) { // e2 가 작거나 같음
					// pass
					continue;
				}
				else {
					// s2 < s1 < e2
					count[i]++;
				}
			}
			// 값 하나씩 넣기
			wr.write(count[i] + "\n"); 
		}

		wr.flush(); 
		wr.close();
		sc.close();
	}

}
