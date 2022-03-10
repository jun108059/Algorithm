package study.me.java.Greedy;

public class Greedy01 {

    public static void main(String[] args) {

        int n = 11; // 전체 배열 크기
        int[] stations = {4, 11}; // 기지국 위치
        int w = 1; // 전파 도달 거리
//
//        int n = 16; // 전체 배열 크기
//        int[] stations = {9}; // 기지국 위치
//        int w = 2; // 전파 도달 거리

        int solution = solution(n, stations, w);

        System.out.println("solution = " + solution);
    }

    public static int solution(int n, int[] stations, int w) {

        int MAX_CHANGE = (w * 2) + 1; // 최대 전파 도달 상수
        int total = 0; // 증설할 최소 기지국 개수
        int start = 0; // 체크 시작점

        for (int station : stations) {
            int stationStart = station - w - 1;
            int stationEnd = w * 2 + stationStart;
            if (stationStart < 1) {
                // station 이 왼쪽으로 치우친 경우
                start = stationEnd + 1;
                continue;
            }
            int distance = stationStart - start;
            int needStationCnt = distance / MAX_CHANGE;
            if (distance % MAX_CHANGE > 0) needStationCnt++;
            // System.out.println("start = " + start);
            // System.out.println("stationStart = " + stationStart);
            // System.out.println("needStationCnt = " + needStationCnt);
            total = total + needStationCnt;
            // System.out.println("total = " + total);
            start = stationEnd + 1;

            // System.out.println("==================");
        }

        if (start < n) {
            int distance = n - start;
            int needStationCnt = distance / MAX_CHANGE; // 필요한 기지국 개수
            if (distance % MAX_CHANGE > 0) needStationCnt++;
            // System.out.println("need distance = " + distance);
            total = total + needStationCnt;
            // System.out.println("total = " + total);
        }

        return total;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 74.4MB)
테스트 2 〉	통과 (0.02ms, 72.3MB)
테스트 3 〉	통과 (0.02ms, 78.2MB)
테스트 4 〉	통과 (0.03ms, 76.5MB)
테스트 5 〉	통과 (0.01ms, 74.2MB)
테스트 6 〉	통과 (0.02ms, 72.8MB)
테스트 7 〉	통과 (0.02ms, 73.3MB)
테스트 8 〉	통과 (0.03ms, 75.8MB)
테스트 9 〉	통과 (0.02ms, 87.2MB)
테스트 10 〉 통과 (0.02ms, 76MB)
테스트 11 〉 통과 (0.02ms, 78.7MB)
테스트 12 〉 통과 (0.01ms, 76MB)
테스트 13 〉 통과 (0.01ms, 76MB)
테스트 14 〉 통과 (0.01ms, 73.6MB)
테스트 15 〉 통과 (0.03ms, 79.4MB)
테스트 16 〉 통과 (0.02ms, 76.4MB)
테스트 17 〉 통과 (0.01ms, 73.5MB)
테스트 18 〉 통과 (0.02ms, 74.2MB)
테스트 19 〉 통과 (0.02ms, 78.6MB)
테스트 20 〉 통과 (0.02ms, 77.9MB)
테스트 21 〉 통과 (0.02ms, 73.3MB)

효율성  테스트
테스트 1 〉	통과 (0.83ms, 53.7MB)
테스트 2 〉	통과 (0.53ms, 52.4MB)
테스트 3 〉	통과 (0.87ms, 53.4MB)
테스트 4 〉	통과 (0.84ms, 52.3MB)

채점 결과
정확성: 70.5
효율성: 29.5
합계: 100.0 / 100.0
 */