package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 #1550 : 16진수 (브론즈5)
 * https://www.acmicpc.net/problem/1550
 *
 * 16진수 수를 입력받아서 10진수로 출력
 */
public class P1550_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();

        System.out.println(Integer.parseInt(hex, 16));
    }
}