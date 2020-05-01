// 278. First Bad Version
// 20.05.01
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVer1sion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //if(isBadVersion(n)) return n;
        int start = 0;
        int end = n;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(!isBadVersion(mid)) 
                start = mid + 1;
            else end = mid - 1;
        }
        if(!isBadVersion(mid)) 
            return mid + 1;
        return mid;
    }
}
