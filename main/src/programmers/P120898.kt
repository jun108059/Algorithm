package programmers

class P120898 {
    companion object {
        /**
         * 메시지 길이 *2 출력
         *
         * - [편지](https://school.programmers.co.kr/learn/courses/30/lessons/120898)
         *
         * **동작 방식:**
         * - `message`의 길이 2배 값을 return
         *
         * **예제:**
         * ```
         * val result = P120898.solution("happy birthday!")
         * // result = 30
         * ```
         *
         * @param  message 메시지 String
         * @return 메시지 길이 *2
         */
        fun solution(message: String) = message.length * 2
    }
}

