package programmers

/**
 * 2차원으로 만들기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120842)
 * - num_list를 다음 설명과 같이 2차원 배열로 바꿔 return 하도록 solution 함수를 완성해주세요.
 * - num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
 * - 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
 * - result = [[1, 2], [3, 4], [5, 6], [7, 8]]
 */
class P120842 {
    companion object {
        fun solution(numList: IntArray, n: Int) = numList.toList().chunked(n)
    }
}
