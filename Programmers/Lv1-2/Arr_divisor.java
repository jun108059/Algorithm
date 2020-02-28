package programmers;

public class Arr_divisor {

	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;
		int[] answer = solution(arr, divisor);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	static int[] solution(int[] arr, int divisor) {
		int check_Exist = 0; // 나누어지는 element 존재 여부
		int[] temp_val = new int[arr.length]; // 유효한 인덱스만 저장
		// @param : arr 자연수 배열, divisor 나누는 자연수
		for (int i = 0; i < arr.length; i++) {
			// 나누어질 때만 값 저장
			if ((arr[i] % divisor) == 0) {
				check_Exist++;
				temp_val[i] = arr[i];
			}
		}
		// 만약 나누어지는 값 없다면 -1 return
		if (check_Exist == 0) {
			int[] check = { -1 };
			return check;
		}
		// 나누어지는 값만 포함한 배열 생성
		int[] answer = new int[check_Exist];
		int j = 0;
		for (int i = 0; i < temp_val.length; i++) {
			if (temp_val[i] != 0) {
				answer[j] = temp_val[i];
				j++;
			}
		}
		// sorting
		for (int i = 0; i < answer.length; i++) {
			for (int k = i; k < answer.length; k++) {
				if (answer[i] > answer[k]) {
					// swap
					int temp = answer[i];
					answer[i] = answer[k];
					answer[k] = temp;
				}
			}
		}
		return answer;
	}
}
