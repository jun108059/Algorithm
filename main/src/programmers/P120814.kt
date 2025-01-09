package programmers

import kotlin.math.ceil


/**
 * 피자 나눠 먹기(1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120814)
 * - 피자를 일곱 조각으로 잘라서 나눌 때, 사람 n명이 모두 피자 한 조각 이상 먹기 위해 필요한 피자 수를 return
 */
class P120814 {
    companion object {
        private const val PIZZA_PIECE = 7
        fun solution(n: Int): Int = if (n % PIZZA_PIECE == 0) n / PIZZA_PIECE else n / PIZZA_PIECE + 1

        @Deprecated("For Logging", ReplaceWith("solution(n)"))
        fun solution2(n: Int): Int = ceil(n / 7.0).toInt()
    }
}
