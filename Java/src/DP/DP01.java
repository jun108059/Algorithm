package DP;

public class DP01 {
    public static void main(String[] args) {

        int[][] triangle = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}};
        int solution = solution(triangle);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] triangle) {

//        int answer = 0; // max
//
//        for (int i = 1; i < triangle.length; i++) {
//            for (int j = 0; j < triangle[i].length; j++) {
//
//                if(j == 0) {
//                    // right 값만 존재하는 경우
//                    triangle[i][j] = triangle[i][j] + triangle[i-1][j];
//                } else if (i == j) {
//                    // left 값만 존재하는 경우
//                    triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
//                } else {
//                    // 정상적인 경우
//                    int left =  triangle[i][j] + triangle[i-1][j-1];
//                    int right = triangle[i][j] + triangle[i-1][j];
//
//                    triangle[i][j] = Math.max(left, right);
//                }
//
//                answer = Math.max(answer, triangle[i][j]);
//            }
//
//        }
//        return answer;

        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {

                int left = triangle[i][j] + triangle[i+1][j];
                int right = triangle[i][j] + triangle[i+1][j+1];

                triangle[i][j] = Math.max(left, right);
            }
        }

        return triangle[0][0];
    }
}

/*
1차
정확성  테스트
테스트 1 〉	통과 (0.03ms, 73.3MB)
테스트 2 〉	통과 (0.03ms, 67.8MB)
테스트 3 〉	통과 (0.08ms, 72.3MB)
테스트 4 〉	통과 (0.12ms, 75.2MB)
테스트 5 〉	통과 (0.41ms, 73.3MB)
테스트 6 〉	통과 (0.11ms, 77.9MB)
테스트 7 〉	통과 (0.55ms, 75.8MB)
테스트 8 〉	통과 (0.14ms, 70MB)
테스트 9 〉	통과 (0.03ms, 74.8MB)
테스트 10 〉	통과 (0.10ms, 84.4MB)

효율성  테스트
테스트 1 〉	통과 (10.58ms, 61.4MB)
테스트 2 〉	통과 (10.13ms, 58.9MB)
테스트 3 〉	통과 (11.23ms, 62.1MB)
테스트 4 〉	통과 (9.22ms, 59.1MB)
테스트 5 〉	통과 (10.21ms, 60.8MB)
테스트 6 〉	통과 (12.32ms, 61MB)
테스트 7 〉	통과 (10.94ms, 62.1MB)
테스트 8 〉	통과 (7.95ms, 57MB)
테스트 9 〉	통과 (11.05ms, 57.7MB)
테스트 10 〉	통과 (13.80ms, 61.1MB)

채점 결과
정확성: 64.3
효율성: 35.7
합계: 100.0 / 100.0

 */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 76.6MB)
테스트 2 〉	통과 (0.03ms, 70.5MB)
테스트 3 〉	통과 (0.04ms, 76.7MB)
테스트 4 〉	통과 (0.09ms, 77MB)
테스트 5 〉	통과 (0.23ms, 74.5MB)
테스트 6 〉	통과 (0.08ms, 70MB)
테스트 7 〉	통과 (0.23ms, 80.7MB)
테스트 8 〉	통과 (0.10ms, 76.3MB)
테스트 9 〉	통과 (0.06ms, 76.6MB)
테스트 10 〉	통과 (0.07ms, 73.8MB)

효율성  테스트
테스트 1 〉	통과 (6.66ms, 60MB)
테스트 2 〉	통과 (6.63ms, 58.9MB)
테스트 3 〉	통과 (9.21ms, 60.8MB)
테스트 4 〉	통과 (6.81ms, 59.2MB)
테스트 5 〉	통과 (8.16ms, 61MB)
테스트 6 〉	통과 (7.48ms, 60.3MB)
테스트 7 〉	통과 (9.23ms, 60.5MB)
테스트 8 〉	통과 (7.71ms, 60.6MB)
테스트 9 〉	통과 (6.74ms, 60.4MB)
테스트 10 〉	통과 (8.86ms, 57.7MB)
채점 결과
정확성: 64.3
효율성: 35.7
합계: 100.0 / 100.0
 */