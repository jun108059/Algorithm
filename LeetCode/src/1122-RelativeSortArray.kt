/**
 *  1. arr1 배열을 mutableList로 copy / 빈 mutableList 생성
 *  2. 이중 for문으로 전체 배열 비교
 *  3. arr2 for loop 내부에서 mutableList 비교하면서 하나씩 삭제 + 빈 list에 추가
 *  4. 전체 순회 후 남은 mutableList sorting
 *  5. 새로 생성한 mutableList에 남은 mutableList 추가
 *  6. 배열로 변환
 *
 * @param arr1 정렬해야하는 배열
 * @param arr2 상대적 순서를 정의하는 배열
 * @return arr1을 arr2의 상대적 순서에 맞게 정렬한 배열
 */
fun relativeSortArrayV1(arr1: IntArray, arr2: IntArray): IntArray {
    val sourceList = arr1.toMutableList()
    val targetList: MutableList<Int> = mutableListOf()
    for (element in arr2) {
        val iterator = sourceList.iterator()
        while (iterator.hasNext()) {
            val sourceElement = iterator.next()
            if (sourceElement == element) {
                targetList.add(sourceElement)
                iterator.remove()
            }
        }
    }
    sourceList.sort()
    targetList.addAll(sourceList)
    return targetList.toIntArray()
}

/**
 * 두 개의 배열 arr1과 arr2가 주어지면 arr2의 요소는 서로 다르며 arr2의 모든 요소는 arr1에도 존재함
 * arr1에 있는 항목의 상대적 순서가 arr2와 동일하도록 arr1의 요소를 정렬
 * arr2에 나타나지 않는 요소는 arr1의 끝에 오름차순으로 배치
 *
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 *
 * @param arr1 정렬해야하는 배열
 * @param arr2 상대적 순서를 정의하는 배열
 * @return arr1을 arr2의 상대적 순서에 맞게 정렬한 배열
 */
fun relativeSortArrayV2(arr1: IntArray, arr2: IntArray): IntArray {
    val count = IntArray(1001)
    val result = IntArray(arr1.size)
    var index = 0

    for (element in arr1) {
        count[element]++
    }

    for (element in arr2) {
        while (count[element]-- > 0) {
            result[index++] = element
        }
    }

    for (i in count.indices) {
        while (count[i]-- > 0) {
            result[index++] = i
        }
    }

    return result
}