package programmers

class P120908 {
    companion object {
        /**
         * 문자열 포함 여부 판별
         *
         * - [문자열안에 문자열](https://school.programmers.co.kr/learn/courses/30/lessons/120908)
         *
         * **동작 방식:**
         * - str1 문자열에 str2 문자열이 포함되어 있으면 "1" return 없으면 "2" return
         *
         * **예제:**
         * ```
         * val result = P120908.solution("apple", "app")
         * // result = 1
         * ```
         *
         * @param str1 target 문자열
         * @param str2 찾을 문자열
         * @return 문자열 포함 여부
         */
        fun solution(str1: String, str2: String): Int = if (str1.contains(str2)) 1 else 2
    }
}

