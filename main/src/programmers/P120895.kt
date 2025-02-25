package programmers

import java.util.*

class P120895 {
    companion object {
        /**
         * 문자열의 인덱스 두개 바꾸기
         *
         * - [인덱스 바꾸기](https://school.programmers.co.kr/learn/courses/30/lessons/120895)
         *
         * **동작 방식:**
         * - 문자열 `myString`에서 `num1` 인덱스와, `num2` 인덱스의 문자를 바꿉니다
         *
         * **예제:**
         * ```
         * val result = P120895.solution("hello", 1, 2)
         * // result = "hlelo"
         * ```
         *
         * @param  myString 문자열
         * @param  num1     바꿀 인덱스1
         * @param  num2     바꿀 인덱스2
         * @return 바뀐 문자열
         */
        fun solution(myString: String, num1: Int, num2: Int): String {
            return myString.toList().let {
                Collections.swap(it, num1, num2)
                it.joinToString("")
            }
        }
    }
}

