package programmers

class P120903 {
    companion object {
        /**
         * 두 배열의 같은 원소의 개수를 return
         *
         * - [배열의 유사도](https://school.programmers.co.kr/learn/courses/30/lessons/120903)
         *
         * **동작 방식:**
         * - s1, s2 두 배열의 같은 원소의 개수를 return
         *
         * **예제:**
         * ```
         * val result = P120903.solution(arrayOf("a", "b", "c"), arrayOf("b", "a", "d"))
         * // result = 2
         * ```
         *
         * @param s1 배열 1
         * @param s2 배열 2
         * @return 같은 원소의 개수
         */
        fun solution(s1: Array<String>, s2: Array<String>) = s1.count { s2.contains(it) }
    }
}

