package programmers

/**
 * 두 수의 나눗셈
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120806)
 * - 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return
 */
class P120806 {
    companion object {
        fun solution(num1: Int, num2: Int) = (num1.toDouble() / num2 * 1000).toInt()
    }
}
