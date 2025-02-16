package programmers

import java.util.*

/**
 * 컨트롤 제트
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120853)
 * s : 숫자와 "Z"가 공백으로 구분되어 담긴 문자열
 * 문자열에 있는 숫자를 차례대로 더하고, "Z"가 나오면 바로 전에 더했던 숫자를 뺀다
 * s = "1 2 Z 3", result = 4
 * s = "10 20 30 40", result = 100
 * s = "10 Z 20 Z 1", result = 1
 */
class P120853 {
    companion object {
        fun solution(s: String): Int {
            val stack = Stack<Int>()
            s.split(" ").forEach {
                when (it) {
                    "Z" -> stack.pop()
                    else -> stack.push(it.toInt())
                }
            }
            return stack.sum()
        }
    }
}
