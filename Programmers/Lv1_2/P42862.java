package Lv1_2;

import java.util.Arrays;

/**
 * 체육복
 *
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */
public class P42862 {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution(n, lost, reserve));
    }

    /**
     * 체육복이 있는 최대 학생 수 구하기
     *
     * @param n       총 학생 수
     * @param lost    잃어버린 학생 배열
     * @param reserve 여벌옷이 있는 학생 배열
     * @return 체육복이 있는 최대 학생 수
     */
    public static int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if ((k - 1 == reserve[j]) || (k + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
