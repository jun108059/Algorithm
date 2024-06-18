fun main() {
    // isNStraightHand()
    // heightChecker()
    relativeSortArray()
}

// 1122. Relative Sort Array
fun relativeSortArray() {
    // println(relativeSortArray(intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19), intArrayOf(2, 1, 4, 3, 9, 6)).contentToString())
    println(relativeSortArrayV2(intArrayOf(28, 6, 22, 8, 44, 17), intArrayOf(22, 28, 8, 6)).contentToString())
}

// 75. Sort Colors
fun sortColors() {
    println(sortColors(intArrayOf(2, 0, 2, 1, 1, 0)))
}

// 1051. Height Checker
fun heightChecker() {
    // println(heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
    println(heightChecker(intArrayOf(5,1,2,3,4)))
}

// 1. Two Sum
fun twoSum() {
    twoSum(intArrayOf(2, 7, 11, 15), 9).forEach {
        print("$it ")
    }
}

// 846. Hand of Straights
fun isNStraightHand() {
    println(isNStraightHand(intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8), 3))
}
