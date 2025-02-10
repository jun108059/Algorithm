package programmers

/**
 * 팩토리얼
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120848)
 * - i 팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미
 * - 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return
 * n = 3628800	return = 10
 * n = 7	return = 3
 */
class P120848 {
    companion object {
        fun solution(n: Int): Int {
            var i = 1
            var factorial = 1
            while (factorial <= n) {
                i++
                factorial *= i
            }
            return i - 1
        }
    }
}
