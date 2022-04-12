package String;

import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 */
public class String10 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    /**
     * 문자열 s의 각 문자가 문자 t와 떨어진 거리 array 리턴
     *
     * @param s 문자열
     * @param t 특정 문자
     * @return 떨어진 거리 Array
     */
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

}
