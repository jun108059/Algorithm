package programmers

/**
 * 삼각형의 완성조건 (1)
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120889)
 * sides : IntArray - 삼각형의 변의 길이
 * return : Int - 삼각형이 완성되면 1, 아니면 2
 * sides = [2, 3, 4], result = 1
 * sides = [2, 3, 5], result = 2
 */
class P120889 {
    companion object {
        fun solution(sides: IntArray): Int {
            val sortedSides = sides.sorted()
            return if (sortedSides[0] + sortedSides[1] > sortedSides[2]) 1 else 2
        }
    }
}
