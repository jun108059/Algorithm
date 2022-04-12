package String;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 */
public class String11 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

    /**
     * 연속된 문자를 압축해서 return
     *
     * @param s 문자열
     * @return 압축된 문자열
     */
    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

}
