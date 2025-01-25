package programmers

/**
 *
 * 배열 자르기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120833)
 * - numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
 */
class P120833 {
    companion object {
        fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2 + 1)
    }
}
