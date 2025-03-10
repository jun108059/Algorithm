package programmers


class P120911 {
    companion object {
        /**
         * 문자열을 모두 소문자로 변경하고 알파벳 순서로 정렬하는 메서드
         *
         * - [문자열 정렬하기 (2)](https://school.programmers.co.kr/learn/courses/30/lessons/120911)
         *
         * **동작 방식:**
         * - 문자열을 모두 소문자로 변경하고 알파벳 순서로 정렬
         *
         * **예제:**
         * ```
         * val result = P120911.solution("BcAD")
         * // result = abcd
         * ```
         *
         * @param myString 문자열
         * @return 소문자로 변경하고 알파벳 순서로 정렬된 문자열
         */
        fun solution(myString: String) = myString.lowercase().toCharArray().sorted().joinToString("")
    }
}

