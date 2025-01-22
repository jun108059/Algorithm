package programmers


/**
 * 각도기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120829)
 * - 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류
 * 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return
 */
class P120829 {
    companion object {
        fun solution(angle: Int): Int = when (angle) {
            in 1 until 90 -> 1
            90 -> 2
            in 91 until 180 -> 3
            else -> 4
        }
    }
}
