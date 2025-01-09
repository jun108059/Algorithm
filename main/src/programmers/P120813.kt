package programmers


/**
 * 짝수는 싫어요
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120813)
 * - n 이하의 홀수가 오름차순으로 담긴 배열을 return
 */
class P120813 {
    companion object {
        fun solution(n: Int): IntArray = (1..n).filter { it % 2 != 0 }.toIntArray()
    }
}
