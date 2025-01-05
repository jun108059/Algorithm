package programmers

/**
 * 숫자 비교하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120807)
 * - 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return
 */
class P120807 {
    companion object {
        fun solution(num1: Int, num2: Int) = if (num1 == num2) 1 else -1
    }
}
