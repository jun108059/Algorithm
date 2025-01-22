package programmers


/**
 * 특정문자 제거하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120826)
 * - myString에서 letter를 제거한 문자열을 return
 */
class P120826 {
    companion object {
        fun solution(myString: String, letter: String) = myString.replace(letter, "")
    }
}
