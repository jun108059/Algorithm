import programmers.*

fun main() {
    println("P120827 : ${P120829.solution(182)}") // Output: 4
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
