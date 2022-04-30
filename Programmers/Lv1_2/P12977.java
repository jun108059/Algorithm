package Lv1_2;

public class P12977 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int answer = solution(nums);
        System.out.println("answer = " + answer);
    }

    public static int result = 0;

    /**
     * 3개의 수를 더했을 때 소수가 되는 경우의 개수
     *
     * @param nums 숫자 배열
     * @return 더해서 소수가 되는 경우
     */
    public static int solution(int[] nums) {
        int answer;
        int n = nums.length;
        int r = 3;

        int[] arr = new int[n];
        combination(arr, 0, n, r, 0, nums);
        answer = result;

        return answer;
    }

    public static void combination(int[] arr, int index, int n, int r, int target, int[] nums) {
        if (r == 0)
            checkPrime(arr, index);
        else if (target == n)
            return;
        else {
            arr[index] = nums[target];
            combination(arr, index + 1, n, r - 1, target + 1, nums);
            combination(arr, index, n, r, target + 1, nums);
        }
    }

    public static void checkPrime(int[] arr, int length) {
        int cnt = 0;
        boolean isPrime = false;
        for (int i = 0; i < length; i++) {
            cnt += arr[i];
        }
        for (int i = 2; i < cnt; i++) {
            // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
            if (cnt % i == 0) {
                // 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
                isPrime = true;
                // 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
                break;
            }
        }

        if (!isPrime) {
            result++;
        }
    }
}
