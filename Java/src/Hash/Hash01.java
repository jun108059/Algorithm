package Hash;

import java.util.*;

public class Hash01 {

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "head_gear"},
                                {"blue_sunglasses", "eye_wear"},
                                {"green_turban", "head_gear"}};

        int solution = solution(clothes);

        System.out.println("solution = " + solution);
    }

    public static int solution(String[][] clothes) {

//        Map<String, Integer> counts = new HashMap<>();

        int total = Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c + 1)
                .reduce(1, (c, n) -> c * n);
//
//        // clothes [의상 이름][종류]
//        for (String[] clothe : clothes) {
//            String type = clothe[1];
//            counts.put(type, counts.getOrDefault(type, 0) + 1);
//        }
//
//        int total = 1;
//
//        for (Integer count : counts.values()) {
//            total = total * (count + 1);
//        }

        total -= 1;

        return total;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (3.18ms, 78.2MB)
테스트 2 〉	통과 (3.15ms, 83.7MB)
테스트 3 〉	통과 (3.60ms, 73.5MB)
테스트 4 〉	통과 (2.97ms, 70.9MB)
테스트 5 〉	통과 (2.01ms, 66.1MB)
테스트 6 〉	통과 (2.90ms, 81.7MB)
테스트 7 〉	통과 (3.03ms, 75.4MB)
테스트 8 〉	통과 (2.27ms, 71.6MB)
테스트 9 〉	통과 (3.22ms, 81.4MB)
테스트 10 〉 통과 (1.91ms, 74MB)
테스트 11 〉 통과 (2.53ms, 74.4MB)
테스트 12 〉 통과 (2.74ms, 68.3MB)
테스트 13 〉 통과 (2.08ms, 74.8MB)
테스트 14 〉 통과 (2.76ms, 74.7MB)
테스트 15 〉 통과 (2.81ms, 71.2MB)
테스트 16 〉 통과 (3.19ms, 74.7MB)
테스트 17 〉 통과 (3.03ms, 81.3MB)
테스트 18 〉 통과 (2.29ms, 73.4MB)
테스트 19 〉 통과 (2.20ms, 80.5MB)
테스트 20 〉 통과 (2.02ms, 75.5MB)
테스트 21 〉 통과 (1.81ms, 76.6MB)
테스트 22 〉 통과 (2.61ms, 78MB)
테스트 23 〉 통과 (2.33ms, 77.4MB)
테스트 24 〉 통과 (2.57ms, 75MB)
테스트 25 〉 통과 (2.66ms, 69.9MB)
테스트 26 〉 통과 (2.86ms, 74.7MB)
테스트 27 〉 통과 (2.14ms, 74MB)
테스트 28 〉 통과 (2.83ms, 79.6MB)

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */