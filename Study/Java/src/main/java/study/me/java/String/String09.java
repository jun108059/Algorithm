package study.me.java.String;

import java.util.Scanner;

/**
 * 09. 숫자 추출
 */
public class String09 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }

    /**
     * 문자열에서 숫자만 추출
     * 
     * @param s 문자열
     * @return 숫자만 추출된 정수
     */
    public static int solution(String s) {
        // int answer = 0;
        String answer = "";
        for (char x : s.toCharArray()) {
            // if(x>=48 && x<=57) answer = answer*10 + (x-48);
            /*
              if (Character.isDigit(x)) {
                 answer = answer*10 + Character.getNumericValue(x);
              }
             */
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
    
}