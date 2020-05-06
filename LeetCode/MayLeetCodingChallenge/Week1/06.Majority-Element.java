// Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int sol = 0, count = 0;
        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                sol = nums[i];
                count = 1;
            }else if(sol == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return sol;
    }
}
