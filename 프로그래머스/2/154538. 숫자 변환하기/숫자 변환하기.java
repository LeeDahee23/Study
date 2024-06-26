import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[3000003];
        Arrays.fill(dp, -1);
        dp[x] = 0;

        for(int i=x; i<=Math.max(y/3, y-n); i++){
            if(dp[y] > 0) break;
            if(dp[i] < 0) continue;

            dp[i+n] = dp[i+n] < 0 ? dp[i] + 1 : Math.min(dp[i+n], dp[i] + 1);
            dp[i*2] = dp[i*2] < 0 ? dp[i] + 1 : Math.min(dp[i*2], dp[i] + 1);
            dp[i*3] = dp[i*3] < 0 ? dp[i] + 1 : Math.min(dp[i*3], dp[i] + 1);
        }

        return dp[y];
    }
}