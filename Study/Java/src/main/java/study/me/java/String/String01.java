package study.me.java.String;

import java.util.Scanner;

/**
 * 01. 문자 찾기
 */
public class String01 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 첫 줄 문자열
        char c = kb.next().charAt(0); // 찾고 싶은 문자
        System.out.print(solution(str, c));
    }

    /**
     * 문자열에서 특정 문자의 개수 count
     *
     * @param str 문자열
     * @param t   특정 문자
     * @return 특정 문자의 개수
     */
    public static int solution(String str, char t) {
        int answer = 0;
        // 대소문자 구분하지 않기 때문에 Upper
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }

        return answer;
    }

}