// First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length;i++) {
            if(s.indexOf(arr[i]) == s.lastIndexOf(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}
