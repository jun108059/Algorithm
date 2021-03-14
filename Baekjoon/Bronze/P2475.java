package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 백준 #2475 : 검증수 (브론즈5)
 * https://www.acmicpc.net/problem/2475
 *
 * 숫자 5개를 받아 각 숫자의 제곱의 합을 10으로 나눈 나머지 출력
 */
public class P2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger result = new BigInteger("0");
        for (int i = 0; i < 5; i++) {
            BigInteger numA = sc.nextBigInteger();
            result = result.add(numA.multiply(numA));
        }
        result = result.remainder(BigInteger.valueOf(10));
        System.out.println(result);
    }
}