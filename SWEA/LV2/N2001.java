package lv2;
import java.util.Scanner;
/*
 * SW Expert Academy
 * [2001] 파리 퇴치
 * N x N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수를 의미한다.
 * M x M 크기의 파리채를 한 번 내리쳐 최대한 많은 파리를 죽이고자 한다.
 * 죽은 파리의 개수를 구하라!
 */

public class N2001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) {
			int size = scan.nextInt();
			int [][] flying = new int[size][size];
			int a_size = scan.nextInt();
			int [] sum = new int[(size-a_size+1)*(size-a_size+1)];
			int fin_sum = 0;
			// Input data 배열에 할당해주기
			for (int i=0; i<flying.length; i++) {
				for (int k=0; k<flying[i].length; k++) {
					flying[i][k] = scan.nextInt();
				}
			}
			// 수의 합 중 가장 큰 경우 찾기
			for (int n=0; n<sum.length; n++) {
				for (int i=0; i<a_size; i++) {
					for (int k=0; k<a_size; k++) {
						sum[n] += flying[i+(n/size)][k+(n/size)];
					}
				}
				System.out.print("> " + sum[n]);
				if (fin_sum <= sum[n])	{
					fin_sum = sum[n];
					
				}
			}
			System.out.println("#" + test_case + " " + fin_sum);
		}
		scan.close();
	}
}
