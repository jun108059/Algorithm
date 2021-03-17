package baekjoon;

import java.util.Scanner;

/**
 * 백준 #2914 : 저작권(브론즈5:분류)
 * https://www.acmicpc.net/problem/2914
 *
 * 멜로디 / 앨범 수록곡 = 평균(올림)
 */
public class P2914 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 앨범에 수록된 곡 && 평균값
        int album = scan.nextInt();
        int averageValue = scan.nextInt();
        // 적어도 몇 곡이 저작권이 있는 멜로디인지
        int answer = album * (averageValue-1) + 1;

        System.out.println(answer);
    }
}