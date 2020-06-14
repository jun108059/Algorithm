import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//상품 개수 입력 받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] star = new int[num];
		int purchase = 0; // solution
		// 평점 입력 받기
		for (int i = 0; i < num; i++) {
			star[i] = sc.nextInt();
		}
		// sorting
		Arrays.sort(star);
		
		/******test code*******/
		// for (int i = 0; i < star.length; i++) {
		// 	System.out.print(star[i] + " ");
		// }
		/**********************/
		
		// 같은 값이 몇개 씩 있는지 배열 만들기
		int[] count = new int[num];
		int j = 0;
		count[0] = 1; // 처음 값은 무조건 존재한다고 가정
		for (int i = 0; i < count.length - 1; i++) {
			// 같은 값이 나온다면 ++
			if(star[i] == star[i+1]) {
				count[j]++;
			}
			// 다른 값이면 다음 count 올리기
			else {
				j++;
				count[j]++;
			}
		}
		/******test code*******/
//		 for (int i = 0; i < count.length; i++) {
//		 	System.out.print(count[i] + " ");
//		 }
		/**********************/
//		System.out.println();
		// count를 하나씩 줄이면서 실제 구매욕구 횟수 늘리기
		// 내려가면서 하나씩 유효 값을 줄여주는 방식으로 설계
		int checkFirst = 1; // 1이면 처음 0이면 실행
		for (int i = 0; i < count.length - 1; i++) {
			checkFirst = 1;
			// i번째에 유효 값이 있다면
			if(count[i] > 0) {
				// count[i]가 첫 검사라면
				if(checkFirst == 1) {
					checkFirst = 0;
					count[i]--;
				}
				for (int k = i+1; k < count.length; k++) {
					if (count[k] > 0) {
						count[k]--;
						purchase++;
					}
//					for (int p = 0; p < count.length; p++) {
//					 	System.out.print(count[p] + " ");
//					}
//					System.out.println();
				}
			}
			// 아직 첫번째에서 유효값 존재
			if(count[i] != 0) {
				i--;
			}
		}
//		System.out.println();
		System.out.println(purchase);
		sc.close();
	}
}
