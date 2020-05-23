/* 986. Interval List Intersections
* Reference
* https://www.cnblogs.com/Dylan-Java-NYC/p/11403342.html
*/

class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A == null || B == null){
            return null;
        }

        List<int []> resList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<A.length && j<B.length){
            int maxStart = Math.max(A[i][0], B[j][0]);
            int minEnd = Math.min(A[i][1], B[j][1]);
            if(maxStart <= minEnd){
                resList.add(new int[]{maxStart, minEnd});
            }

            if(A[i][1]<B[j][1]){
                i++;
            }else{
                j++;
            }
        }

        int [][] res = new int[resList.size()][2];
        for(int ind = 0; ind<resList.size(); ind++){
            res[ind] = resList.get(ind);
        }

        return res;
    }
}
