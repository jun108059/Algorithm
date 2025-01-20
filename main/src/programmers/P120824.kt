package programmers


/**
 * 짝수 홀수 개수
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120824)
 * - numList Int 배열의 값 중 짝수의 개수와 홀수의 개수를 return
 */
class P120824 {
    companion object {
        fun solution(numList: IntArray): IntArray {
            numList.partition { it % 2 == 0 }.let {
                return intArrayOf(it.first.size, it.second.size)
            }
        }
    }
}
