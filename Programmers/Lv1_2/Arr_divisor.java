package Lv1_2;

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
		int check_Exist = 0; // ���������� element ���� ����
		int[] temp_val = new int[arr.length]; // ��ȿ�� �ε����� ����
		// @param : arr �ڿ��� �迭, divisor ������ �ڿ���
		for (int i = 0; i < arr.length; i++) {
			// �������� ���� �� ����
			if ((arr[i] % divisor) == 0) {
				check_Exist++;
				temp_val[i] = arr[i];
			}
		}
		// ���� ���������� �� ���ٸ� -1 return
		if (check_Exist == 0) {
			int[] check = { -1 };
			return check;
		}
		// ���������� ���� ������ �迭 ����
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
