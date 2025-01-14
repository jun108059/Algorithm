package programmers


/**
 * 아이스 아메리카노
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120819)
 * - 한잔에 5,500원
 * - 돈 money가 매개변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return
 */
class P120819 {
    companion object {
        fun solution(money: Int): IntArray {
            val max = money / 5500
            val remain = money % 5500
            return intArrayOf(max, remain)
        }
    }
}
