package programmers

/**
 * 암호 해독
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120892)
 * cipher : 암호화된 문자열, code : 문자열에서 code의 배수번째 글자만 진짜 암호
 * return : 진짜 암호
 * cipher = "abcdefg", code = 3, return = "cf"
 */
class P120892 {
    companion object {
        fun solution(cipher: String, code: Int) =
            cipher.filterIndexed { index, _ -> (index + 1) % code == 0 }
    }
}
