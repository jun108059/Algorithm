package programmers

class P120893 {
    companion object {
        /**
         * 대문자와 소문자
         *
         * - [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120893)
         * - 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return
         *
         * @param   myString   변환할 문자열
         * @return  대문자 소문자 변환한 문자열
         * @sample P120893.solution("abCdEfghIJ") # "ABcDeFGHij"
         */
        fun solution(myString: String): String = myString.map {
            when {
                it.isLowerCase() -> it.uppercaseChar()
                else -> it.lowercaseChar()
            }
        }.joinToString("")
    }
}

