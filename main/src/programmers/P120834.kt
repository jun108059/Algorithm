package programmers

/**
 * 외계행성의 나이
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120834)
 * - a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
 * - 나이 age가 매개변수로 주어질 때, 이를 문자열로 표현하여 return
 */
class P120834 {
    companion object {
        fun solution(age: Int): String {
            return age.toString().map { str ->
                when (str) {
                    '0' -> 'a'
                    '1' -> 'b'
                    '2' -> 'c'
                    '3' -> 'd'
                    '4' -> 'e'
                    '5' -> 'f'
                    '6' -> 'g'
                    '7' -> 'h'
                    '8' -> 'i'
                    else -> 'j'
                }
            }.joinToString("")
        }
    }
}
