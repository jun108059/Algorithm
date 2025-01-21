package programmers


/**
 * 문자 반복 출력
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120825)
 * - myString에 들어있는 각 문자를 n만큼 반복한 문자열을 return
 */
class P120825 {
    companion object {
        fun solution(myString: String, n: Int) = myString.map {
            it.toString().repeat(n)
        }.joinToString("")
    }
}
