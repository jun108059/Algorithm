package study.me.java.String;

import java.util.Scanner;

/**
 * 07. 회문 문자열-01
 */
public class String07_01 {

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        String07_01 T = new String07_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}