package programmers

class P120897 {
    companion object {
        /**
         * 약수를 오름차순으로 담은 배열
         *
         * - [약수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120897)
         *
         * **동작 방식:**
         * - `n`의 약수를 오름차순으로 담은 배열을 return
         *
         * **예제:**
         * ```
         * val result = P120897.solution("24")
         * // result = [1, 2, 3, 4, 6, 8, 12, 24]
         * ```
         *
         * @param  n 정수
         * @return `n`의 약수를 오름차순으로 담은 배열
         */
        fun solution(n: Int) = (1..n).filter { n % it == 0 }.toIntArray()
    }
}

