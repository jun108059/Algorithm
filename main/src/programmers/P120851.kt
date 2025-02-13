package programmers

/**
 * 숨어있는 숫자의 덧셈(1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120851)
 * my_string안의 모든 자연수들의 합을 return
 * "aAb1B2cC34oOp"	10
 */
class P120851 {
    companion object {
        fun solution(myString: String) = myString.filter { it.isDigit() }.map { it.toString().toInt() }.sum()
    }
}
