import java.io.*;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int temp = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int studentNum = scan.nextInt();
		int[] score1 = new int[studentNum];
		int[] score2 = new int[studentNum];
		int[] originScore1 = new int[studentNum];
		int[] originScore2 = new int[studentNum];
		int[] cnt1 = new int[studentNum];
		int[] cnt2 = new int[studentNum];
		
		for (int i = 0; i < studentNum; i++) {
			score1[i] = scan.nextInt();
			originScore1[i] = score1[i];
		}
		for (int i = 0; i < studentNum; i++) {
			score2[i] = scan.nextInt();
			originScore2[i] = score2[i];
		}
		// first sorting 
		for (int i = 0; i < studentNum; i++) {
			for (int k = 0; k < studentNum; k++) {
				if (score1[i] > score1[k]) {
					temp = score1[i];
					score1[i] = score1[k];
					score1[k] = temp;
				}
			}
		}
		
		for (int i = 0; i < studentNum; i++) {
			for (int k = 0; k < studentNum; k++) {
				if (originScore1[i] == score1[k]) {
					cnt1[i] = k;
				}
			}
		}
		
		// second sorting 
		for (int i = 0; i < studentNum; i++) {
			for (int k = 0; k < studentNum; k++) {
				if (score2[i] > score2[k]) {
					temp = score2[i];
					score2[i] = score2[k];
					score2[k] = temp;
				}
			}
		}
		
		for (int i = 0; i < studentNum; i++) {
			for (int k = 0; k < studentNum; k++) {
				if (originScore2[i] == score2[k]) {
					cnt2[i] = k;
				}
			}
		}
		int min = 100000;
		for (int i = 0; i < studentNum; i++) {
			if (cnt1[i] != cnt2[i]) {
				if (min > cnt1[i]) {
					min = cnt1[i]+1;
				}
			}
		}
		if (min == 100000) {
			System.out.println("agree");
		}
		else {
			System.out.println(min);
		}
	}
}