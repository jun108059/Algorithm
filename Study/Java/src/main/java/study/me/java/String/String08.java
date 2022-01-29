package study.me.java.String;

import java.util.Scanner;

/**
 * 08. 유효한 팰린드롬
 */
public class String08 {

    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        String08 T = new String08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}