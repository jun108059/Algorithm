import java.util.Scanner;
import java.math.BigInteger;

/**
 * 백준 #1271 : 엄청난 부자2
 * https://www.acmicpc.net/problem/1271
 *
 * 돈 나눠갖기
 */
public class P1271{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();

        System.out.println(num1.divide(num2));
        System.out.println(num1.mod(num2));
    }
}