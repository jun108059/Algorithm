import java.util.Scanner;

/*
 * SW Expert Academy
 * [1979] 어디에 단어가 들어갈 수 있을까
 * NxN 크기의 단어퍼즐 -> K길이의 단어가 딱 맞게 들어가는 경우의 수 출력
 */

public class N1979 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case 수 입력
		for (int j = 0; j < test; j++) { // test case 만큼 Loop
			int array_size = scan.nextInt();		// Array Size 입력
			int find_word = scan.nextInt(); 		// 찾아야 하는 단어의 길이
			int [][] word_puzzle = new int[array_size][array_size];	 // word puzzle 2차원 배열 선언
			int line_count = 0;						// k길이 단어가 들어갈 수 있는 경우
			int solution = 0;						// line_count의 합
			
			for (int k = 0; k < word_puzzle.length; k++) { // word puzzle 세로길이 만큼 입력
				for (int i = 0; i < word_puzzle[k].length; i++) { // word puzzle 가로줄 입력
					word_puzzle[k][i] = scan.nextInt();
					if (word_puzzle[k][i] == 1) {
						line_count++;
					}
					// 가로줄에 들어갈 수 있는 경우
					if (word_puzzle[k][i] == 0 || i == (word_puzzle[k].length - 1)) {
						if (line_count == find_word) {
							solution++;
						}
						line_count = 0;
					}
				}
			}
			// 세로줄에 들어갈 수 있는 경우
			for (int k = 0; k < word_puzzle.length; k++) {
				for (int i = 0; i < word_puzzle.length; i++) {
					if (word_puzzle[i][k] == 1) {
						line_count++;
					}
					if (word_puzzle[i][k] == 0 || i == (word_puzzle[i].length - 1)) {
						if (line_count == find_word) {
							solution++;
						}
						line_count = 0;
					}
				}
				line_count = 0;
			}
			System.out.println("#"+ (j+1) + " " + solution);
		}
	}

}
