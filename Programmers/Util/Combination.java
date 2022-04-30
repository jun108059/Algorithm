package Util;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        for (int r = 1; r <= arr.length; r++) {
            System.out.println("\n" + arr.length + "개 중에 " + r + "개 뽑음");
            comb(arr, visited, 0, r);
        }
    }

    // 재귀를 이용해 구현
    static void comb(int[] arr, boolean[] visited, int depth, int r) {
        if (r == 0) {
            print(arr, visited);
            return;
        }
        if (depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, r - 1);

            visited[depth] = false;
            comb(arr, visited, depth + 1, r);
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}