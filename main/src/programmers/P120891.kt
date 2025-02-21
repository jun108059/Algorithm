package programmers

/**
 * 369게임
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120891)
 * 3, 6, 9의 개수를 세어서 return
 */
class P120891 {
    companion object {
        fun solution(order: Int) = order.toString().count { it == '3' || it == '6' || it == '9' }
    }
}
