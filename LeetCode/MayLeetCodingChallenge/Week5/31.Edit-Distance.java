// Edit Distance

public class Solution {
    /**
     * @param word1: A string
     * @param word2: A string
     * @return: The minimum number of steps.
     */
    public int minDistance(String word1, String word2) {
        if (word1.length() == 0) {
            return word2.length();
        }
         
        if (word2.length() == 0) {
            return word1.length();
        }
         
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[2][n + 1];
        int old = 0;
        int cur = 1;
         
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
         
        for (int i = 1; i <= word1.length(); i++) {
            dp[cur][0] = i;
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[cur][j] = dp[old][j - 1];
                } else {
                    dp[cur][j] = Math.min(dp[old][j - 1], Math.min(dp[old][j], dp[cur][j - 1])) + 1;
                }
            }
             
            old = cur;
            cur = 1 - cur;
             
        }
         
        return dp[old][n];
    }
}
