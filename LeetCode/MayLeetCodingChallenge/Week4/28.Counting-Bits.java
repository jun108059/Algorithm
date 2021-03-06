/* Counting Bits
 *
 * Given a non negative integer number num. 
 * For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's 
 * in their binary representation and return them as an array.
 * 
 * Example :
 * For num = 5 you should return [0,1,1,2,1,2]
 *
 */
 
class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
 
        int p = 1; //p tracks the index for number x
        int pow = 1;
        for(int i=1; i<=num; i++){
            if(i==pow){
                result[i] = 1;
                pow <<= 1;
                p = 1;
            }else{
                result[i] = result[p]+1;
                p++;
            }
 
        }
 
        return result;
    }
}
// Reference
// https://www.programcreek.com/2015/03/leetcode-counting-bits-java/

// Improved Solution

// For number 2(10), 4(100), 8(1000), 16(10000), ..., the number of 1's is 1. Any other number can be converted to be 2^m + x. For example, 9=8+1, 10=8+2. The number of 1's for any other number is 1 + # of 1's in x.
// public int[] countBits(int num) {
//     int[] result = new int[num+1];
 
//     int p = 1; //p tracks the index for number x
//     int pow = 1;
//     for(int i=1; i<=num; i++){
//         if(i==pow){
//             result[i] = 1;
//             pow <<= 1;
//             p = 1;
//         }else{
//             result[i] = result[p]+1;
//             p++;
//         }
 
//     }
 
//     return result;
// }
