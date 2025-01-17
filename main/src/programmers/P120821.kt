package programmers


/**
 * 배열뒤집기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120821)
 * - num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return
 */
class P120821 {
    companion object {
        fun solution(numList: IntArray) = numList.reversed().toIntArray()
    }
}
