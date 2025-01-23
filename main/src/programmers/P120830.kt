package programmers


/**
 * 양꼬치
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120830)
 * - 양꼬치 10인분 주문할때마다 음료수 하나를 무료로 제공
 * - 양꼬치는 1인분에 12,000원, 음료수는 2,000원
 * - 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return
 */
class P120830 {
    companion object {
        fun solution(n: Int, k: Int) = n * 12_000 + k * 2_000 - n / 10 * 2_000
    }
}
