package Lv1_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class P12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        // 첫번째 숫자 add
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            // arr[1]부터 직전 숫자와 비교 후 다르면 add
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        // List to Array(Primitive)
        return list.stream().mapToInt(i -> i).toArray();
    }
}
