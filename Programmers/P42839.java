import java.util.*;

/**
 * 완전탐색(Brute Force Search)
 * 프로그래머스 #42839 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 
 * 종이 조각으로 만들 수 있는 소수가 몇개인지?
**/
class P42839 {
    public static void main(String[] args) {

    }

    private static int cnt = 0;
    private static String[] map;
    private static String[] result;
    private static boolean[] visit;
    private static HashSet<Integer> list;

    public int solution(String numbers) {
        int answer = 0;

        visit = new boolean[numbers.length()];
        map = new String[numbers.length()];
        map = numbers.split("");

        list = new HashSet();

        for (int i=1; i<=numbers.length(); i++) {
            result = new String[i];
            cycle(0, i, numbers.length());
        }

        return list.size();
    }

    public void cycle(int start, int end, int length) {

        if (start == end) {
            findPrime();
        } else {

            for (int i=0; i<length; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    result[start] = map[i];
                    cycle(start+1, end, length);
                    visit[i] = false;
                }
            }

        }

    }

    public void findPrime() {

        // 숫자로 변환
        String str = "";
        for(int i=0; i<result.length; i++)
            str += result[i];
        int num = Integer.parseInt(str);

        // 예외 처리
        if(num == 1 || num == 0)
            return;

        // 소수 인지 검사
        boolean flag = false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0)
                flag = true;
        }

        if(!flag)
            list.add(num);
    }
}