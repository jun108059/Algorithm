package programmers


/**
 * 옷가게 할인 받기
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120818)
 * - 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인
 * - 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return
 */
class P120818 {
    companion object {
        fun solution(price: Int) =
            if (price >= 500000) (price * 0.8).toInt()
            else if (price >= 300000) (price * 0.9).toInt()
            else if (price >= 100000) (price * 0.95).toInt()
            else price
    }
}
