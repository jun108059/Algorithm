package baekjoon;

import java.util.Scanner;

/**
 * 백준 #1550 : 16진수 (브론즈5)
 * https://www.acmicpc.net/problem/1550
 *
 * 16진수 수를 입력받아서 10진수로 출력
 */
public class P1550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hexadecimal = scan.nextLine();
        char[] hexaArray = hexadecimal.toCharArray();
        int hexaSize = hexaArray.length;

        double result = 0;

        // A : 10, B: 11, C: 12, D: 13, E: 14, F: 15
        for (char cr: hexaArray) {

            double tenPow = Math.pow(16, hexaSize-1);
            // ASCII 숫자
            if(48 <= (int)cr && (int)cr < 58) {
                double number = Integer.parseInt(String.valueOf(cr));
                result += number * tenPow;
                hexaSize--;
            }
            else {
                // ASCII 문자
                switch ((int)cr) {
                    case 65 :
                        result += 10 * tenPow;
                        hexaSize--;
                        break;
                    case 66 :
                        result += 11 * tenPow;
                        hexaSize--;
                        break;
                    case 67 :
                        result += 12 * tenPow;
                        hexaSize--;
                        break;
                    case 68 :
                        result += 13 * tenPow;
                        hexaSize--;
                        break;
                    case 69 :
                        result += 14 * tenPow;
                        hexaSize--;
                        break;
                    case 70 :
                        result += 15 * tenPow;
                        hexaSize--;
                        break;
                }
            }
        }
        int answer = (int) result;
        System.out.println(answer);
    }
}