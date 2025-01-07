package programmers


/**
 * 분수의 덧셈
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120808)
 * - 첫 번째 분수의 분자와 분모를 뜻하는 두 개의 정수 numeralA, denominatorA가 매개변수로 주어집니다.
 * - 두 번째 분수의 분자와 분모를 뜻하는 두 개의 정수 numeralB, denominatorB가 매개변수로 주어집니다.
 * - 두 분수를 더한 결과를 기약분수(분자, 분모 순서로 당믄 배열)로 return
 */
class P120808 {
    companion object {
        fun solution(
            numeratorA: Int,
            denominatorA: Int,
            numeratorB: Int,
            denominatorB: Int
        ): IntArray {
            // 공통 분모 계산
            val lcmDenominator = denominatorA * denominatorB
            // 분자 계산
            val resultNumerator = numeratorA * denominatorB + numeratorB * denominatorA
            // 최대공약수로 약분
            val gcdValue = gcd(resultNumerator, lcmDenominator)

            return intArrayOf(resultNumerator / gcdValue, lcmDenominator / gcdValue)
        }

        private fun gcd(a: Int, b: Int): Int {
            // 유클리드 호제법을 사용해 최대공약수 계산
            return if (b == 0) a else gcd(b, a % b)
        }
    }
}
