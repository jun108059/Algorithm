package study.me.java.Sort;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort01 {
    public static void main(String[] args) {

        int[] numbers = {6, 10 ,2};

        String solution = solution(numbers);

        System.out.println("solution = " + solution);
    }

    public static String solution(int[] numbers) {

        // Stream 활용하기
        String collect = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());
        if (collect.startsWith("0")) return "0";

        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        String[] strNums = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        // 내림차순 정렬을 위해 String compareTo 구현
        // 기준값이 비교값보다 큰지 작은지
        Arrays.sort(strNums, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        StringBuilder answer = new StringBuilder();
        for (String strNum : strNums) {
            answer.append(strNum);
        }
        if (answer.toString().startsWith("0")) return "0";
        return answer.toString();
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (131.11ms, 117MB)
테스트 2 〉	통과 (111.74ms, 109MB)
테스트 3 〉	통과 (144.95ms, 137MB)
테스트 4 〉	통과 (18.90ms, 75MB)
테스트 5 〉	통과 (109.21ms, 109MB)
테스트 6 〉	통과 (141.80ms, 111MB)
테스트 7 〉	통과 (4.07ms, 73MB)
테스트 8 〉	통과 (3.70ms, 73.3MB)
테스트 9 〉	통과 (5.90ms, 70.6MB)
테스트 10 〉통과 (4.28ms, 78.8MB)
테스트 11 〉통과 (4.26ms, 73.8MB)

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */