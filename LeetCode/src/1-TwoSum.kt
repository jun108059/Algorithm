/**
 * nums 배열 중 2개의 값을 더해서 `target`을 만들 수 있는 인덱스 2개 찾기
 *
 * @param nums int 값 배열
 * @param target 더해서 만들어야 하는 값
 * @return 더해서 `target`을 만들 수 있는 인덱스 2개
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        val complement = target - num
        map[num]?.let { return intArrayOf(it, index) }
        map.getOrPut(complement) { index }
    }
    throw IllegalArgumentException("No two sum solution")
}