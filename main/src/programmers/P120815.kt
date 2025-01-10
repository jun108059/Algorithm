package programmers


/**
 * 피자 나눠 먹기(2)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120815)
 * - 피자를 6조각으로 나눠진다. n명이 같은 수의 피자 조각을 먹으려면 최소 몇 판을 시켜야 하는지 return
 * 최소공배수 = n * 6 / 최대공약수
 */
class P120815 {
    companion object {
        private const val PIZZA_PIECE = 6
        fun solution(n: Int): Int {
            return lcm(n, PIZZA_PIECE) / PIZZA_PIECE
        }

        private fun lcm(n: Int, m: Int) = n * m / gcd(n, m)

        private fun gcd(n: Int, m: Int): Int {
            return if (n < m) {
                if (n == 0) m else gcd(n, m % n)
            } else {
                if (m == 0) n else gcd(m, n % m)
            }
        }
    }
}
