package Lv1_2;

/**
 * 약수의 개수와 덧셈
 *
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 */
public class P77884 {

    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int answer = solution(left, right);
        System.out.println("answer = " + answer);
    }

    /**
     * 약수의 개수 : 짝수는 더하고, 홀수는 뺀 수 구하기
     *
     * @param left  시작 수
     * @param right 마지막 수
     * @return 약수의 개수 처리 후 값
     */
    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }

            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
}
