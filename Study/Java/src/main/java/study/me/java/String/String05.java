package study.me.java.String;

import java.util.Scanner;

/**
 * 05. 특정 문자 뒤집기
 */
public class String05 {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        String05 T = new String05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}