package programmers

/**
 * 문자열 정렬하기(1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120850)
 * - "p2o4i8gj2"	[2, 2, 4, 8]
 */
class P120850 {
    companion object {
        fun solution(myString: String) =
            myString.filter { it.isDigit() }.map { it.toString().toInt() }.sorted().toIntArray()
    }
}
