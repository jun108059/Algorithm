import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		if (min - 45 < 0) {
			if (hour - 1 < 0) {
				hour = 23;
			}
			else {
				hour = hour - 1;
			}
			min = 60 + (min-45);
		}
		else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
		scan.close();
	}
}