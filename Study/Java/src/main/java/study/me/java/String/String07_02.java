package study.me.java.String;

import java.util.Scanner;

/**
 * 07. 회문 문자열-02
 */
public class String07_02 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }

}