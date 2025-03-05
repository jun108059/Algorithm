package programmers

class P120906 {
    companion object {
        /**
         * 모든 자리 숫자 더한 값 return
         *
         * - [자릿수 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/120906)
         *
         * **동작 방식:**
         * - `n`의 각 자리 숫자의 합을 return
         *
         * **예제:**
         * ```
         * val result = P120906.solution(930211)
         * // result = 16
         * ```
         *
         * @param n 정수
         * @return 각 자리 숫자의 합
         */
        fun solution(n: Int) = n.toString().sumOf { it.digitToInt() }
    }
}

