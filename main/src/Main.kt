fun main() {
    isNStraightHand()
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
