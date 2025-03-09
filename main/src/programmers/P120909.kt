package programmers

import kotlin.math.sqrt

class P120909 {
    companion object {
        /**
         * 제곱수 판별
         *
         * - [제곱수 판별하기](https://school.programmers.co.kr/learn/courses/30/lessons/120909)
         *
         * **동작 방식:**
         * - `n`이 제곱수라면 1 아니면 2 return
         *
         * **예제:**
         * ```
         * val result = P120909.solution(144)
         * // result = 1
         * ```
         *
         * @param n 정수
         * @return 제곱수 판별 결과
         */
        fun solution(n: Int) = if (sqrt(n.toDouble()) % 1 == 0.0) 1 else 2
    }
}

