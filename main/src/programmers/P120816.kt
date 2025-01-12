package programmers


/**
 * 피자 나눠 먹기(3)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120816)
 */
class P120816 {
    companion object {
        fun solution(slice: Int, n: Int): Int = if (n % slice == 0) {
            n / slice
        } else {
            n / slice + 1
        }
    }
}
