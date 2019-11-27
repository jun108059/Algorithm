import java.io.*;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int count = 1;
		int solution = 0;
		int temp = 1;
		Scanner scan = new Scanner(System.in);
		int lineNum = scan.nextInt();
		String[] animal = new String[lineNum];
		for (int i = 0; i < lineNum; i++) {
			animal[i] = scan.next();
		}
		
		for (int i = lineNum-1; i >= 0; i--) {
			if (animal[i].equals("O")) {
				if (count == 1) {
					solution = solution + 1;
				}
				else if (count == 2) {
					solution = solution + 2;
				}
				else {
					for (int k = 0; k <= count-2; k++) {
						temp = temp*2;
					}
					solution = solution + temp;
				}
			}
			count++;
			temp = 1;
		}
		System.out.println(solution);

	}
}