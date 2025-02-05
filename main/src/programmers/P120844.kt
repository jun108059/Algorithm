package programmers

/**
 * 배열회전시키기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120844)
 * - 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return
 * - direction은 "left" 와 "right" 둘 중 하나
 * [4, 455, 6, 4, -1, 45, 6] "left" [455, 6, 4, -1, 45, 6, 4]
 */
class P120844 {
    companion object {
        fun solution(numbers: IntArray, direction: String): IntArray {
            val result = IntArray(numbers.size)
            for (i in numbers.indices) {
                val index = when (direction) {
                    "left" -> (i + 1) % numbers.size
                    else -> (i - 1 + numbers.size) % numbers.size
                }
                result[i] = numbers[index]
            }
            return result
        }
    }
}
