package programmers


/**
 * 배열 두배 만들기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120809)
 * - numbers 각 원소에 두배한 원소를 가진 배열을 return
 */
class P120809 {
    companion object {
        fun solution(numbers: IntArray) = numbers.map { it * 2 }.toIntArray()
    }
}
