package String;

import java.util.Scanner;

/**
 * 06. 중복문자제거
 */
public class String06 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

}