import programmers.*

fun main() {
    println("P120847 : ${P120847.solution(intArrayOf(1, 2, 3, 4, 5))}") // Output: 20
}

@Deprecated("Use main() instead", ReplaceWith("test()"))
fun test() {
    println("P12082 : ${P120802.solution(5, 3)}") // Output: 8
    println("P12083 : ${P120803.solution(5, 3)}") // Output: 2
    println("P12084 : ${P120804.solution(5, 3)}") // Output: 15
    println("P12085 : ${P120805.solution(5, 3)}") // Output: 1
    println("P12086 : ${P120806.solution(5, 3)}") // Output: 1666
    println("P12087 : ${P120807.solution(5, 3)}") // Output: -1
    printIntArray("P12088", P120808.solution(5, 3, 6, 7)) // Output: 53, 21
    printIntArray("P12089", P120809.solution(intArrayOf(1, 2, 3))) // Output: 2, 4, 6
    println("P120810 : ${P120810.solution(5, 3)}") // Output: 2
    println("P120811 : ${P120811.solution(intArrayOf(9, -1, 0))}") // Output: 0
    println("P120812 : ${P120812.solution(intArrayOf(1, 2, 3, 2, 5))}") // Output: 2
    printIntArray("P120813", P120813.solution(5)) // Output: 1, 3, 5
    println("P120814 : ${P120814.solution(15)}") // Output: 3
    println("P120815 : ${P120815.solution(10)}") // Output: 5
    println("P120816 : ${P120816.solution(3, 10)}") // Output: 4
    println("P120817 : ${P120817.solution(intArrayOf(1, 2, 3))}") // Output: 2.0
    println("P120818 : ${P120818.solution(500000)}") // Output: 400000
    printIntArray("P120819", P120819.solution(122000)) // Output: 22, 1000
    println("P120820 : ${P120820.solution(40)}") // Output: 1983
    printIntArray("P120821", P120821.solution(intArrayOf(1, 2, 3))) // Output: 3, 2, 1
    println("P120822 : ${P120822.solution("abc")}") // Output: cba
    println("P120823 : ${P120823.solution("4")}") // Output: 15
    printIntArray("P120824", P120824.solution(intArrayOf(1, 2, 3, 4, 5, 7))) // Output: 2, 4
    println("P120825 : ${P120825.solution("test", 2)}") // Output: tteesstt
    println("P120826 : ${P120826.solution("testA", "A")}") // Output: test
    println("P120829 : ${P120829.solution(182)}") // Output: 4
    println("P120830 : ${P120830.solution(64, 6)}") // Output: 120000
    println("P120831 : ${P120831.solution(5)}") // Output: 6
    printIntArray("P120833", P120833.solution(intArrayOf(1, 2, 3, 4, 5), 1, 3)) // Output: 2, 3, 4
    println("P120834 : ${P120834.solution(23)}") // Output: cd
    printIntArray("P120835", P120835.solution(intArrayOf(3, 76, 24))) // Output: 3, 1, 2
    println("P120836 : ${P120836.solution(20)}") // Output: 6
    println("P120837 : ${P120837.solution(999)}") // Output: 201
    println("P120838 : ${P120838.solution(".... . .-.. .-.. ---")}") // Output: hello
    println("P120839 : ${P120839.solution("205")}") // Output: 052
    println("P120840 : ${P120840.solution(5, 3)}") // Output: 10
    println("P120841 : ${P120841.solution(intArrayOf(12, 5))}") // Output: 1
    println(
        "P120842 : ${
            P120842.solution(
                intArrayOf(1, 2, 3, 4, 5, 6, 7, 8),
                2
            )
        }"
    ) // Output: [[1, 2], [3, 4], [5, 6], [7, 8]]
    println("P120843 : ${P120843.solution(intArrayOf(1, 2, 3, 4, 5, 6), 5)}") // Output: 3
    printIntArray(
        "P120844 : ",
        P120844.solution(intArrayOf(4, 455, 6, 4, -1, 45, 6), "left")
    ) // Output: [455, 6, 4, -1, 45, 6, 4]
    println("P120845 : ${P120845.solution(intArrayOf(10, 8, 6), 3)}") // Output: 12
    println("P120846 : ${P120846.solution(10)}") // Output: 5
}

fun printIntArray(problemNum: String, array: IntArray) {
    print("$problemNum : ")
    array.forEachIndexed { index, i ->
        print(i)
        if (index != array.size - 1) {
            print(", ")
        } else {
            println()
        }
    }
}
