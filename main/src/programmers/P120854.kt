package programmers

/**
 * 배열 원소의 길이
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120854)
 * strlist : 문자열을 담은 배열
 * return : 각 원소의 길이를 담은 배열
 * strlist = ["We", "are", "the", "world!"], result = [2, 3, 3, 6]
 */
class P120854 {
    companion object {
        fun solution(strlist: Array<String>) = strlist.map { it.length }.toIntArray()
    }
}
