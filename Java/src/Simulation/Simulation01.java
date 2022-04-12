package Simulation;

import java.util.Arrays;

public class Simulation01 {

    public static void main(String[] args) {

        int[] teamA = {5, 1, 3, 7}; // A 팀
        int[] teamB = {2, 2, 6, 8}; // B 팀

//        int[] teamA = {2, 2, 2, 2}; // A 팀
//        int[] teamB = {1, 1, 1, 1}; // B 팀

        int solution = solution(teamA, teamB);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[] A, int[] B) {

        int total = 0;

        // A팀 sorting {1, 3, 5, 7}
        // B팀 sorting {2, 2, 6, 8}
        Arrays.sort(A);
        Arrays.sort(B);

        int index = B.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (B[index] > A[i]) {
                index--;
                total++;
            }
        }

        return total;
    }
}
/*
정확성  테스트
    테스트 1 〉	통과 (0.31ms, 74.9MB)
    테스트 2 〉	통과 (0.41ms, 77.2MB)
    테스트 3 〉	통과 (0.50ms, 73.5MB)
    테스트 4 〉	통과 (0.47ms, 72.7MB)
    테스트 5 〉	통과 (0.59ms, 71.4MB)
    테스트 6 〉	통과 (0.37ms, 72.7MB)
    테스트 7 〉	통과 (0.40ms, 73.4MB)
    테스트 8 〉	통과 (0.39ms, 73.4MB)
    테스트 9 〉	통과 (1.34ms, 77.8MB)
    테스트 10 〉 통과 (0.67ms, 78.7MB)
    테스트 11 〉 통과 (0.88ms, 72.5MB)
    테스트 12 〉 통과 (0.69ms, 73.6MB)
    테스트 13 〉 통과 (5.08ms, 81.6MB)
    테스트 14 〉 통과 (4.76ms, 77.9MB)
    테스트 15 〉 통과 (4.04ms, 86.3MB)
    테스트 16 〉 통과 (5.04ms, 68.7MB)
    테스트 17 〉 통과 (0.39ms, 73.9MB)
    테스트 18 〉 통과 (0.52ms, 77.5MB)

효율성  테스트
    테스트 1 〉	통과 (72.53ms, 67.1MB)
    테스트 2 〉	통과 (64.33ms, 65.1MB)
    테스트 3 〉	통과 (106.66ms, 64.2MB)

채점 결과
    정확성: 85.7
    효율성: 14.3
    합계: 100.0 / 100.0

 */