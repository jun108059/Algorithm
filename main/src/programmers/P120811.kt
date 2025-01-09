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

/*
    * array.sorted 정리
    * - array.sorted() : 오름차순 정렬
      * 내부 로직에서 List 객체를 반환
    * - array.sortedDescending() : 내림차순 정렬
    * - array.sortedBy { it } : 오름차순 정렬
    * - array.sortedByDescending { it } : 내림차순 정렬
    * - array.sortedBy { it % 2 } : 홀수, 짝수 순으로 정렬
    * - array.sortedBy { it.toString().length } : 길이 순으로 정렬
    *
 */