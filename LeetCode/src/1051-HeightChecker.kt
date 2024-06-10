/**
 * 정렬된 배열과 비교하여 다른 값의 개수를 반환
 *
 * @param heights 학생들의 키 배열
 * @return 정렬된 배열과 비교하여 다른 값의 개수
 */
fun heightChecker(heights: IntArray): Int {
    val sorted = heights.sorted()
    return heights.zip(sorted).count { it.first != it.second }
}
