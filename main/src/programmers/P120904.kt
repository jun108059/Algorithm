package programmers

class P120904 {
    companion object {
        /**
         * `num` 정수를 이루는 숫자 중 `k`가 있으면 자리 수를 return
         *
         * - [숫자 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/120904)
         *
         * **동작 방식:**
         * - num 정수를 이루는 숫자 중 k가 있으면 자리 수를 return
         * - `num`에 `k`가 없으면 -1 return
         * - `num`에 `k`가 여러 개 있으면 가장 처음 나타나는 자리 수 return
         *
         * **예제:**
         * ```
         * val result = P120904.solution(232443, 4)
         * // result = 4
         * ```
         *
         * @param num 정수
         * @param k 찾을 숫자
         * @return 자리 수
         */
        fun solution(num: Int, k: Int): Int {
            val numStr = num.toString()
            if (!numStr.contains(k.toString())) return -1
            return numStr.indexOf(k.toString()) + 1
        }
    }
}

