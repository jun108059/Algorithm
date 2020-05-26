// 1035. Uncrossed Lines
// Reference
// https://github.com/alberyan/Leetcode-Solution/blob/master/1035.%20Uncrossed%20Lines.java

class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = 1; i <= lenA; i++){
            for (int j = 1; j <= lenB; j++){
                if (A[i - 1] == B[j - 1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[lenA][lenB];
    }
}

// Runtime: 4 ms, faster than 100.00% of Java online submissions for Uncrossed Lines.
// Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Uncrossed Lines.
