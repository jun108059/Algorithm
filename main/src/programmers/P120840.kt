package programmers

import java.math.BigInteger

/**
 * 구슬을 나누는 경우의 수
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120840)
 * - 서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 5C3 = 10
 * - share ≤ balls
 */
class P120840 {
    companion object {
        fun solution(balls: Int, share: Int): Int {
            return combination(balls, share).toInt()
        }

        private fun combination(n: Int, k: Int): BigInteger {
            var result = BigInteger.ONE
            // k가 n-k보다 크면, 계산 횟수를 줄이기 위해 더 작은 값을 사용
            val k = if (k > n - k) n - k else k

            for (i in 1..k) {
                result = result.multiply(BigInteger.valueOf((n - i + 1).toLong()))
                result = result.divide(BigInteger.valueOf(i.toLong()))
            }
            return result
        }
    }
}
