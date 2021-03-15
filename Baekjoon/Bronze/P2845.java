package baekjoon;

import java.util.Scanner;

/**
 * 백준 #2845 : 파티가 끝나고 난 뒤
 * https://www.acmicpc.net/problem/2845
 *
 * 파티에 참가한 인원 비교
 */
public class P2845 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoplePerSize = scanner.nextInt();
        int size = scanner.nextInt();

        int totalPerson = peoplePerSize * size;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int checkTotal = scanner.nextInt();
            checkTotal -= totalPerson;
            result.append(checkTotal).append(" ");
        }
        System.out.println(result);
    }
}

