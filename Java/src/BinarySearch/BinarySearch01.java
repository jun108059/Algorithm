package BinarySearch;

import java.util.Arrays;

public class BinarySearch01 {
    public static void main(String[] args) {

        int[] budgets = {120, 110, 140, 150};
        int M = 485;

        int solution = solution(budgets, M);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[] budgets, int M) {

        // 가능한 최대의 총 예산 배정
        // 0원과 최대 금액을 가지고, 이분탐색하여 상한액을 찾기

        int min = 0;
        int max = Arrays.stream(budgets)
                .max().orElse(0);

        int answer = max;
        while (min <= max) {
            final int mid = (min + max) / 2;

            int sum = Arrays.stream(budgets)
                    .map(budget -> Math.min(budget, mid))
                    .sum();

            System.out.println("sum = " + sum);
            if (sum <= M) {
                min = mid + 1;
                answer = mid;
                System.out.println("answer = " + answer);
            } else {
                max = mid - 1;
                System.out.println("max = " + max);
            }
            System.out.println("====================");
        }

        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (1.17ms, 76.1MB)
테스트 2 〉	통과 (0.76ms, 75.4MB)
테스트 3 〉	통과 (0.83ms, 72.1MB)
테스트 4 〉	통과 (0.92ms, 73.3MB)
테스트 5 〉	통과 (0.99ms, 73.1MB)
테스트 6 〉	통과 (0.97ms, 83MB)
테스트 7 〉	통과 (0.71ms, 67.6MB)
테스트 8 〉	통과 (0.72ms, 72.4MB)
테스트 9 〉	통과 (0.72ms, 73.3MB)
테스트 10 〉 통과 (0.87ms, 85.5MB)
테스트 11 〉 통과 (0.76ms, 74.8MB)
테스트 12 〉 통과 (0.82ms, 76.5MB)
테스트 13 〉 통과 (0.77ms, 75.2MB)
테스트 14 〉 통과 (0.87ms, 74.2MB)
테스트 15 〉 통과 (0.77ms, 76.5MB)

효율성  테스트
테스트 1 〉	통과 (2.17ms, 52.5MB)
테스트 2 〉	통과 (15.97ms, 55.5MB)
테스트 3 〉	통과 (4.56ms, 52.8MB)
테스트 4 〉	통과 (4.21ms, 52.7MB)
테스트 5 〉	통과 (5.90ms, 52.6MB)

채점 결과
정확성: 75.0
효율성: 25.0
합계: 100.0 / 100.0
 */