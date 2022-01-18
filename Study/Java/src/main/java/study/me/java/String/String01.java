package study.me.java.String;

import java.util.Scanner;

/**
 * 01. 문자 찾기
 */
public class String01 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String01 T = new String01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }

}