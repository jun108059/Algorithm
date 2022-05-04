package Lv1_2;

/**
 * 문자열 내 p와 y의 개수
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class P12916 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {

        int pCount = 0, yCount = 0;
        // 소문자로 바꿔서 잘라서 배열 변환
        String[] array = s.toLowerCase().split("");

        // for loop : p 와 y 카운팅
        for (String value : array) {
            if ("p".equals(value)) {
                pCount++;
            } else if ("y".equals(value)) {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
