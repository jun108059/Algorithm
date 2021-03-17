package baekjoon;

import java.util.Scanner;

/**
 * 백준 #3003 : 킹, 퀸, 룩, 비숍, 나이트, 폰(브론즈5:분류)
 * https://www.acmicpc.net/problem/3003
 *
 * 체스 세트 완성하기
 */
public class P3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int[] fullPin = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 5; i++) {
            answer.append(fullPin[i] - scan.nextInt()).append(" ");
        }
        answer.append(fullPin[5] - scan.nextInt());

        System.out.println(answer);
    }
}