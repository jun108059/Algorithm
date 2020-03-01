package programmers;
// LV3 멀리 뛰기
// 1칸 or 2칸씩 뛰어서 n칸을 갈 수 있는 경우의 수 구하기
public class HighJump {

	public static void main(String[] args) {
		int n = 5;
		solution(n);
	}
	
	static long solution(int n) {
	    long answer = 0;
	    int[] dp = new int[2000];
	    dp[0] = 1;
	    dp[1] = 2;
	    for (int i = 2; i < n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
		}
	    answer = dp[n-1] % 1234567;
	    System.out.println(answer);
	    return answer;
	}

}
