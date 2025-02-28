package programmers

class P120899 {
    companion object {
        /**
         * 가장 큰 수와 인덱스 찾기
         *
         * - [가장 큰 수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/120899)
         *
         * **동작 방식:**
         * - `array` 중 가장 큰 수와 그 `index`를 return
         *
         * **예제:**
         * ```
         * val result = P120899.solution([1, 8, 3)
         * // result = [8, 1]
         * ```
         *
         * @param  array 숫자 배열
         * @return IntArray [가장 큰 수, 인덱스]
         */
        fun solution(array: IntArray): IntArray = array.maxOrNull().let {
            intArrayOf(it ?: 0, array.indexOf(it ?: 0))
        }
    }
}

