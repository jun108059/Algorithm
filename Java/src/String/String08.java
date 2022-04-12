package String;

import java.util.Scanner;

/**
 * 08. 유효한 팰린드롬
 */
public class String08 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }

    public static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }


}