package programmers

/**
 * 최댓값 만들기(1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120847)
 * - numbers 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
 * - numbers = [1, 2, 3, 4, 5],	return = 20
 */
class P120847 {
    companion object {
        fun solution(numbers: IntArray) = numbers.sorted().run {
            get(size - 1) * get(size - 2)
        }
    }
}
