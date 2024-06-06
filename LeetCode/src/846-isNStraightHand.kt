import java.util.TreeMap

/**
 * 손패의 카드를 그룹으로 나누어 그룹의 크기가 같은 카드가 이어지는지 확인
 *
 * @param hand 카드 배열
 * @param groupSize 나누는 그룹 크기
 * @return 그룹의 크기가 같은 카드가 이어지면 true, 아니면 false
 */
fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
    if (hand.size % groupSize != 0) return false

    val map = TreeMap<Int, Int>()
    for (card in hand) {
        map[card] = map.getOrDefault(card, 0) + 1
    }

    while (map.isNotEmpty()) {
        val firstKey = map.firstKey()
        for (i in firstKey..<firstKey + groupSize) {
            if (!map.containsKey(i)) {
                return false
            }
            if (map[i] == 1) {
                map.remove(i)
            } else {
                map[i] = map[i]!! - 1
            }
        }
    }
    return true
}