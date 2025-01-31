package programmers

/**
 * 가위 바위 보
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120839)
 * - 가위는 2 바위는 0 보는 5, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return
 */
class P120839 {
    companion object {
        fun solution(rsp: String) = rsp.map {
            when (it) {
                '2' -> '0'
                '0' -> '5'
                else -> '2'
            }
        }.joinToString("")
    }
}
