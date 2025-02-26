package programmers

class P120896 {
    companion object {
        /**
         * 한 번만 등장한 문자 찾기
         *
         * - [한 번만 등장한 문자](https://school.programmers.co.kr/learn/courses/30/lessons/120896)
         *
         * **동작 방식:**
         * - 문자열 `s`에서 한 번만 등장하는 문자를 사전순으로 정렬한 문자열을 return
         *
         * **예제:**
         * ```
         * val result = P120896.solution("hello")
         * // result = "eho"
         * ```
         *
         * @param  s 문자열
         * @return 한 번만 등장하는 문자를 사전순으로 정렬한 문자열
         */
        fun solution(s: String): String {
            return s.toSet()
                .filter { uniqueChar ->
                    s.count { it == uniqueChar } == 1
                }.sorted().joinToString("")
        }
    }
}

