package programmers

/**
 * 모스부호 (1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120838)
 * - letter를 영어 소문자로 바꾼 문자열을 return
 */
class P120838 {
    companion object {
        fun solution(letter: String): String {
            val morseMapping = mapOf(
                ".-" to 'a', "-..." to 'b', "-.-." to 'c', "-.." to 'd', "." to 'e', "..-." to 'f',
                "--." to 'g', "...." to 'h', ".." to 'i', ".---" to 'j', "-.-" to 'k', ".-.." to 'l',
                "--" to 'm', "-." to 'n', "---" to 'o', ".--." to 'p', "--.-" to 'q', ".-." to 'r',
                "..." to 's', "-" to 't', "..-" to 'u', "...-" to 'v', ".--" to 'w', "-..-" to 'x',
                "-.--" to 'y', "--.." to 'z'
            )
            return letter.split(" ").map { morseMapping[it] }.joinToString("")
        }
    }
}
