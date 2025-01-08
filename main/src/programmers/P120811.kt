package programmers


/**
 * 중앙값 구하기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120811)
 * - 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값(중앙값) return
 */
class P120811 {
    companion object {
        fun solution(array: IntArray) = array.sorted()[array.size / 2]
    }
}
