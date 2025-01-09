package programmers


/**
 * 최빈값 구하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120812)
 * - 주어진 값 중에서 가장 자주 나오는 값(최빈값) return
 * - 최빈값이 여러 개면 -1을 return
 * - 값이 하나면 그 값을 return
 */
class P120812 {
    companion object {
        fun solution(array: IntArray): Int {
            val map = mutableMapOf<Int, Int>()
            array.forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
            val max = map.maxByOrNull { it.value }?.value ?: 0
            val maxKeys = map.filter { it.value == max }.keys
            return if (maxKeys.size == 1) maxKeys.first() else -1
        }
    }
}
