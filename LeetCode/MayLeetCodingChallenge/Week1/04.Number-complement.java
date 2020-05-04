class Solution {
    public int findComplement(int num) {
		// System.out.println(Integer.toBinaryString(num));
		char[] bits = Integer.toBinaryString(num).toCharArray();
		int m = 1, retVal = 0;
		for (int i = bits.length-1; i >= 0; i--) {
			if (bits[i] == '0') {
				retVal += m;
			}
			m *= 2;
		}
		return retVal;
    }
}
