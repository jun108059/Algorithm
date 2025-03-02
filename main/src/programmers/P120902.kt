package programmers

class P120902 {
    companion object {
        /**
         * 문자열 계산하기
         *
         * - [문자열 계산하기](https://school.programmers.co.kr/learn/courses/30/lessons/120902)
         *
         * **동작 방식:**
         * - `myString` 수식을 계산한 값을 return
         *
         * **예제:**
         * ```
         * val result = P120902.solution("3 + 4 - 2")
         * // result = 5
         * ```
         *
         * @param  myString 수식 문자열
         * @return 계산 결과
         */
        fun solution(myString: String): Int {
            val list = myString.split(" ")
            var result = list[0].toInt()
            for (i in 1 until list.size step 2) {
                when (list[i]) {
                    "+" -> result += list[i + 1].toInt()
                    "-" -> result -= list[i + 1].toInt()
                }
            }
            return result
        }
    }
}

