fun main() {
    // isNStraightHand()
    heightChecker()
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
