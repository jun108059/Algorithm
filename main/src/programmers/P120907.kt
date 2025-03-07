package programmers

class P120907 {
    companion object {
        /**
         * quiz 수식들이 참인지 거짓인지 판별
         *
         * - [OX퀴즈](https://school.programmers.co.kr/learn/courses/30/lessons/120907)
         *
         * **동작 방식:**
         * - `quiz` 수식들이 참인지 거짓인지 판별
         * - 수식은 `a` `op` `b` = `result` 형태
         *
         * **예제:**
         * ```
         * val result = P120907.solution(["3 - 4 = -3", "5 + 6 = 11"])
         * // result = ["X", "O"]
         * ```
         *
         * @param quiz 수식들
         * @return 수식 결과 Array
         */
        fun solution(quiz: Array<String>): Array<String> {
            return quiz.map {
                val (num1, operation, num2, _, result) = it.split(" ")
                when (operation) {
                    "+" -> if (num1.toInt() + num2.toInt() == result.toInt()) "O" else "X"
                    "-" -> if (num1.toInt() - num2.toInt() == result.toInt()) "O" else "X"
                    else -> "X"
                }
            }.toTypedArray()
        }
    }
}

