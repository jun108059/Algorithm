package study.me.java.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 04-1. 단어 뒤집기
 */
public class String04_01 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : solution(str)) {
            System.out.println(x);
        }
    }

    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }


}