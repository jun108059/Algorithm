package programmers

class P120894 {
    companion object {
        /**
         * 영어로 표기되어있는 숫자를 수로 바꾸어 return
         *
         * - [영어가 싫어요](https://school.programmers.co.kr/learn/courses/30/lessons/120894)
         *
         * **동작 방식:**
         * - 문자열 내에서 영어 단어(예: "one", "two", "three")를 인식하여 대응하는 숫자로 변환합니다.
         * - 예를 들어, "oneseveneight"를 입력하면 178을 반환합니다.
         *
         * **예제:**
         * ```
         * val result = P120894.solution("oneseveneight")
         * // result는 178
         * ```
         *
         * @param  numbers  변환할 문자열
         * @return 숫자로 변환한 문자열
         */
        fun solution(numbers: String): Long {
            val sample = mapOf(
                "0" to "zero",
                "1" to "one",
                "2" to "two",
                "3" to "three",
                "4" to "four",
                "5" to "five",
                "6" to "six",
                "7" to "seven",
                "8" to "eight",
                "9" to "nine"
            )
            var result = numbers
            sample.forEach {
                result = result.replace(it.value, it.key)
            }
            return result.toLong()
        }
    }
}

