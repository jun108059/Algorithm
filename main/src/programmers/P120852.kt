package programmers

/**
 * 소인수분해
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120852)
 * 소인수분해 = 어떤 수를 소수들의 곱으로 표현한 것
 * n의 소인수를 오름차순으로 담은 배열 return
 * n = 12, result = [2, 3]
 */
class P120852 {
    companion object {
        fun solution(n: Int): IntArray {
            val result = mutableSetOf<Int>()
            var num = n
            var divisor = 2
            while (divisor <= num) {
                if (num % divisor == 0) {
                    result.add(divisor)
                    num /= divisor
                } else {
                    divisor++
                }
            }
            return result.toIntArray()
        }
    }
}
