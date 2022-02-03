package study.me.java.String;

import java.util.Scanner;

/**
 * 12. 암호
 */
public class String12 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n, str));
    }

    /**
     * 특정 문자를 아스키코드 값으로 변환 후 문자열 return
     *
     * @param n 총 문자 개수
     * @param s 문자열
     * @return 변환된 문자열
     */
    public static String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }
}