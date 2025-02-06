package programmers

/**
 * 주사위 개수
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120846)
 * - 약수의 개수가 세 개 이상인 수를 합성수 - n이하의 합성수 개수 구하기
 * - n = 10, answer = 5
 * - n = 15, answer = 8
 */
class P120846 {
    companion object {
        fun solution(n: Int) = (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size
    }
}
