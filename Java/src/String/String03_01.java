package String;

import java.util.Scanner;

/**
 * 03-1. 문장 속 단어
 */
public class String03_01 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }

    /**
     *
     *
     * @param str
     * @return
     */
    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }


}
