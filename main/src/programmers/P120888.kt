package programmers

/**
 * 중복된 문자 제거
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120888)
 * myString : 문자열
 * return : 중복된 문자를 제거하고 남은 문자열
 * strlist = "people", result = "peol"
 */
class P120888 {
    companion object {
        fun solution(myString: String): String = myString.toSet().joinToString("")
    }
}
