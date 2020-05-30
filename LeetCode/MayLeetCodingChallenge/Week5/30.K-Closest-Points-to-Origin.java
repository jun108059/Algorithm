/*
K Closest Points to Origin

We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
(Here, the distance between two points on a plane is the Euclidean distance.)
You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
Example 1:
Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:
Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
Note:
1 <= K <= points.length <= 10000
-10000 < points[i][0] < 10000
-10000 < points[i][1] < 10000
 */

/**
 * Approach 1: PriorityQueue
 * 
 * O(nlogn)
 */
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] * a[0] + a[1] * a[1] - (b[0] * b[0] + b[1] * b[1]);
            }
        });
        for (int[] point : points) {
            pq.offer(point);
        }

        int[][] rst = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] point = pq.poll();
            rst[i][0] = point[0];
            rst[i][1] = point[1];
        }
        return rst;
    }
}

/**
 * Approach 2: QuickSelect
 * 
 * O(n)
 * QuickSelect :
 *  https://github.com/cherryljr/LintCode/blob/master/Sort%20Colors.java
 *  https://github.com/cherryljr/LintCode/blob/master/Kth%20Largest%20Element.java
 */
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        // distance[i][0]
        // distance[i][1]
        int[][] distances = new int[points.length][2];
        for (int i = 0; i < points.length; i++) {
            distances[i][0] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            distances[i][1] = i;
        }

        helper(distances, 0, distances.length - 1, K - 1);
        int[][] rst = new int[K][2];
        for (int i = 0; i < K; i++) {
            rst[i][0] = points[distances[i][1]][0];
            rst[i][1] = points[distances[i][1]][1];
        }
        return rst;
    }

    // QuickSelect
    private void helper(int[][] distance, int left, int right, int K) {
        if (left >= right) {
            return;
        }

        int pos = partition(distance, left, right);
        if (pos == K) {
            return;
        } else if (pos < K) {
            helper(distance, pos + 1, right, K);
        } else {
            helper(distance, left, pos - 1, K);
        }
    }

    private int partition(int[][] distance, int left, int right) {
        int less = left - 1, more = right;
        while (left < more) {
            if (distance[left][0] < distance[right][0]) {
                swap(distance, ++less, left++);
            } else if (distance[left][0] > distance[right][0]) {
                swap(distance, left, --more);
            } else {
                left++;
            }
        }
        swap(distance, more, right);
        return less + 1;
    }

    private void swap(int[][] distance, int a, int b) {
        int t1 = distance[a][0], t2 = distance[a][1];
        distance[a][0] = distance[b][0];
        distance[a][1] = distance[b][1];
        distance[b][0] = t1;
        distance[b][1] = t2;
    }
    
    // Reference
    // https://medium.com/algorithm-and-datastructure/k-closest-points-to-origin-30da05aaff1d
    // distance = sqrt((y2 — y1) * (y2 — y1) + (x2 — x1) * (x2 — x1))
    
    public int[][] kClosest(int[][] points, int K) {
        HashMap<Double, List<Integer>> map = new HashMap<>();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int[] p = points[i];
            Double distance = Math.sqrt((p[1] - 0) * (p[1] - 0) + (p[0] - 0) * (p[0] - 0));
            map.compute(distance, (k, v) -> v == null ? new ArrayList<>() : v).add(i);
            pq.add(distance);
        }
        System.out.println(map);
        int[][] result = new int[K][2];
        int i = 0;
        while (!pq.isEmpty() && i < K) {
            List<Integer> pos = map.get(pq.poll());
            for (int j : pos) {
                result[i++] = points[j];
            }
        }
        return result;
    }
}

    
