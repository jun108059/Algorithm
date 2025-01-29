package programmers

/**
 * 개미 군단
 * - [link](https://school.programmers.co.kr/learn/courses/30/lessons/120837)
 * - 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력
 * - 체력 hp가 매개변수로 주어질 때, 개미 군단이 hp만큼의 체력을 깎기 위해 공격해야 하는 횟수를 return
 */
class P120837 {
    companion object {
        fun solution(hp: Int) = hp / 5 + (hp % 5) / 3 + (hp % 5) % 3
    }
}
