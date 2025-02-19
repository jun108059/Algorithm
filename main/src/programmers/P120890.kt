package programmers

import kotlin.math.abs

/**
 * 가까운 수
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120890)
 * array = 정수배열, n = 정수
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return
 * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 * array = [3, 10, 28], n = 20, return = 28
 */
class P120890 {
    companion object {
        fun solution(array: IntArray, n: Int) =
            array.sortedWith(
                compareBy<Int> { abs(it - n) }.thenBy { it }
            ).first()
    }
}
