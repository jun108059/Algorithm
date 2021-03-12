package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 백준 #2338 : 긴자리 계산 (브론즈5)
 * https://www.acmicpc.net/problem/2338
 *
 * 두 수 A, B를 입력받아, A+B, A-B, A×B를 출력
 */
public class P2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger numA = sc.nextBigInteger();
        BigInteger numB = sc.nextBigInteger();

        System.out.println(numA.add(numB));
        System.out.println(numA.subtract(numB));
        System.out.println(numA.multiply(numB));
    }
}