package programmers


class P120910 {
    companion object {
        /**
         * 세균 증식 수를 계산
         *
         * - [세균 증식](https://school.programmers.co.kr/learn/courses/30/lessons/120910)
         *
         * **동작 방식:**
         * - 세균이 1시간에 2배씩 증가할 때, `n`마리가 `t`시간 후 몇 마리가 되는지 계산
         *
         * **예제:**
         * ```
         * val result = P120910.solution(2, 10)
         * // result = 2048
         * ```
         *
         * @param n 처음 세균의 마리 수
         * @param t 경과한 시간
         * @return `t`시간 후 세균의 마리 수
         */
        fun solution(n: Int, t: Int) = n shl t
    }
}

