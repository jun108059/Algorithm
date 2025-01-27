package programmers

/**
 * 진료 순서 정하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120835)
 * - emergency : 우선순위 결정 값
 * - return : 우선순위 높은 순으로 순번이 나열된 배열
 */
class P120835 {
    companion object {
        fun solution(emergency: IntArray): IntArray {
            val sortedEmergency = emergency.sortedDescending()
            return emergency.map { sortedEmergency.indexOf(it) + 1 }.toIntArray()
        }
    }
}
