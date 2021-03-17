package baekjoon;

import java.util.Scanner;

/**
 * 백준 #3046 : R2(브론즈5:분류)
 * https://www.acmicpc.net/problem/3046
 *
 * 숫자와 평균으로 나머지 숫자 구하기
 */
public class P3046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int average = scan.nextInt();
        System.out.println((average*2) - num1);
    }
}