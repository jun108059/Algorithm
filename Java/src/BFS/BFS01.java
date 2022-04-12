package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS01 {

    public static void main(String[] args) {

        int[][] n = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int solution = solution(n);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] maps) {

        // 초기 좌표
        Point point = new Point(0, 0);

        int yMax = maps.length; // 아래쪽 끝 좌표
        int xMax = maps[0].length; // 오른쪽 끝 좌표

        Queue<Point> movedQueue = new LinkedList<>();

        int[][] count = new int[yMax][xMax];
        boolean[][] visited = new boolean[yMax][xMax];

        count[0][0] = 1;
        visited[0][0] = true;

        movedQueue.offer(point);

        while(!movedQueue.isEmpty()) {
            Point currentPoint = movedQueue.poll();

            int currentCount = count[currentPoint.y][currentPoint.x];

            // 아래 -> 우측 -> 위 -> 좌측
            final int[][] moving = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

            for (int[] move : moving) {
                Point moved = new Point(currentPoint.y + move[0], currentPoint.x + move[1]);

                // 방문하지 않았고, 맵 범위에 유효하며, 벽이 아닌 경우
                if (!moved.isValid(yMax, xMax)) continue;
                if (visited[moved.y][moved.x]) continue;
                if (maps[moved.y][moved.x] == 0) continue;

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                movedQueue.offer(moved);
            }
        }
        int distance = count[yMax-1][xMax-1];
        if(distance == 0) return -1;
        return distance;
    }

    static class Point {
        int y;
        int x;

        Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        boolean isValid(int yMax, int xMax) {
            if (this.x < 0 || x >= xMax) return false;
            if (this.y < 0 || y >= yMax) return false;
            return true;
        }
    }
}
