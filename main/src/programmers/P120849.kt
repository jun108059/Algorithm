package programmers

/**
 * 모음 제거
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120849)
 * - 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return
 * "nice to meet you"	"nc t mt y"
 */
class P120849 {
    companion object {
        fun solution(myString: String) = myString.filter { it !in "aeiou" }
    }
}
