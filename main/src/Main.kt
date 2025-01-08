import programmers.*

fun main() {
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