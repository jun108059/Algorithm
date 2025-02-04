package programmers

/**
 * 공 던지기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120843)
 * - 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
 * - 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다
 * - 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return
 * - numbers	k	result
 * - [1, 2, 3, 4, 5, 6]	 5	3
 */
class P120843 {
    companion object {
        fun solution(numbers: IntArray, k: Int) = numbers[(2 * (k - 1)) % numbers.size]
    }
}
