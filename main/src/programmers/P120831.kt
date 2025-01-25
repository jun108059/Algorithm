package programmers


/**
 * 짝수의 합
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120831)
 * - n이하의 짝수를 모두 더한 값을 return
 */
class P120831 {
    companion object {
        fun solution(n: Int) = (1..n).filter { it % 2 == 0 }.sum()
    }
}
