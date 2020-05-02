package leetCode;

/* Jewels and Stones
 * 20.05.02
 * J 문자열 = 보석
 * S 문자열 = 내가 가지고있는 보석&돌
 * S중 보석이 몇 개 있는지 return
 * 같은 문자열 찾기!
 */
public class JawelsAndStones {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aaaAAABbbbb";
		int sol = numJewelsInStones(J, S);
		System.out.println(sol);
	}

	static int numJewelsInStones(String J, String S) {
		int count = 0;
		String[] parsedJewls = J.split("");
		String[] parsedStone = S.split("");
		for (int i = 0; i < parsedJewls.length; i++) {
			for (int k = 0; k < parsedStone.length; k++) {
				if(parsedJewls[i].equals(parsedStone[k])) {
					count++;
				}
			}
		}
		return count;
    }
}
