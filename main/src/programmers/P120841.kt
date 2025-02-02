package programmers

/**
 * 점의 위치 구하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120841)
 * - 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다
 * - 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return
 */
class P120841 {
    companion object {
        fun solution(dot: IntArray) = when {
            dot[0] > 0 && dot[1] > 0 -> 1
            dot[0] < 0 && dot[1] > 0 -> 2
            dot[0] < 0 && dot[1] < 0 -> 3
            else -> 4
        }
    }
}
