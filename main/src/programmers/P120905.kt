package programmers

class P120905 {
    companion object {
        /**
         * `n`의 배수 고르기
         *
         * - [`n`의 배수 고르기](https://school.programmers.co.kr/learn/courses/30/lessons/120905)
         *
         * **동작 방식:**
         * - `numlist`에서 `n`의 배수가 아닌 수들을 제거한 뒤 return
         *
         * **예제:**
         * ```
         * val result = P120905.solution(5, intArrayOf(1, 9, 3, 10, 13, 5))
         * // result = [10, 5]
         * ```
         *
         * @param n 정수
         * @param numlist 정수배열
         * @return `n`의 배수가 아닌 수들
         */
        fun solution(n: Int, numlist: IntArray) = numlist.filter { it % n == 0 }.toIntArray()
    }
}

