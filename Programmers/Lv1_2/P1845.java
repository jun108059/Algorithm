package Lv1_2;

import java.util.Arrays;

/**
 * 폰켓몬
 *
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 */
public class P1845 {
    public static void main(String[] args) {
        // 폰켓몬 N마리 중 N/2마리 선택
        // 폰켓몬 종류 = 번호
        // 선택할 수 있는 폰켓몬 종류 최대값
        int[] nums = {3, 1, 2, 7, 4, 5, 6};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        long count = Arrays.stream(nums).sequential().boxed().distinct().count();
        int max = nums.length / 2;
        return count > max ? max : (int) count;
    }
}
