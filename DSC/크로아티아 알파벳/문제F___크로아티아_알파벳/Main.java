import java.io.*;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String alpha = scan.next();
		for (int i = 0; i < alpha.length()-1; i++) {
			if(alpha.charAt(i) == 'c') {
				if(alpha.charAt(i+1) == '=' || alpha.charAt(i+1) == '-') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			else if(alpha.charAt(i) == 'd') {
				if(alpha.charAt(i+1) == '-') {
					count++;
					i++;
				}
				else if(alpha.charAt(i+1) == 'z') {
					if(alpha.charAt(i+2) == '=' && (i+2 <= alpha.length()-1) ) {
						count++;
						i = i + 2;
					}
					else {
						count++;
					}
				}
				else {
					count++;
				}
			}
			else if(alpha.charAt(i) == 'l') {
				if(alpha.charAt(i+1) == 'j') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			else if(alpha.charAt(i) == 'n') {
				if(alpha.charAt(i+1) == 'j') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			else if(alpha.charAt(i) == 's') {
				if(alpha.charAt(i+1) == '=') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			else if(alpha.charAt(i) == 'z') {
				if(alpha.charAt(i+1) == '=') {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}
}