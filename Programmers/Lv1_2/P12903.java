package Lv1_2;

/**
 * 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class P12903 {

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String result;
        if (s.length() % 2 == 0) {
            result = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            result = s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
        }
        return result;
    }
}
