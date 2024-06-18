/**
 * Sort colors in-place so that objects of the same color are adjacent,
 * with the colors in the order 0, 1, 2.
 *
 * You must solve this problem without using the library's sort function.
 *
 * @param nums an array of n objects with red, white, or blue colors
 */
fun sortColors(nums: IntArray): Unit {
    val numZero = nums.count { it == 0 }
    val numOne = nums.count { it == 1 }
    val numTwo = nums.count { it == 2 }

    for (i in 0 until numZero) {
        nums[i] = 0
    }
    for (i in numZero until numZero + numOne) {
        nums[i] = 1
    }
    for (i in numZero + numOne until numZero + numOne + numTwo) {
        nums[i] = 2
    }
}
