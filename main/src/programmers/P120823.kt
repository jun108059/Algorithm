package programmers


/**
 * 직각삼각형 별 출력
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120823)
 * - 직각삼각형 별을 출력하는 함수
 */
class P120823 {
    companion object {
        fun solution(starLinet: String) {
            val n = starLinet.toInt()
            for (i in 1..n) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
        }
    }
}
