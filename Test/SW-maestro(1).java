
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		int total_size = sc.nextInt();
		int[] gg_int = new int[total_size + 1];
		int[] temp = new int[10000001];
		for (int i = 0; i < total_size; i++) {
			gg_int[i] = sc.nextInt();
			temp[i] = gg_int[i];
		}
		
		//cache(임의로 잡은 숫자부터 N번째 순열의 수 전까지 합한 값) + 이전의 숫자까지 더한것) + N번째 순열의 수와 N번째 수열의 수를 비교하는 함수. 
		for(int i=2; i<total_size+1; i++) { 
			temp[i] = Math.max(gg_int[i], gg_int[i] + temp[i-1]); 
		}
		int max = Integer.MIN_VALUE; //연속합중에서 가장 큰 수를 찾는 것. 
		for(int i=1; i<total_size+1; i++) { 
			max = Math.max(temp[i], max); 
		} 
		wr.write(String.valueOf(max)); 
		wr.flush(); 
		wr.close();
		sc.close();
	}

}
