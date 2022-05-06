package Lv1_2;

/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class P12912 {
    public static void main(String[] args) {

    }

    public static long solution(int a, int b) {
        long answer = 0;
        // 시작, 끝 값 매핑
        int start;
        int end;
        if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;
    }
}
