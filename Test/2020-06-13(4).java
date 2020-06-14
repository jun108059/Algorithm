import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 책 제목 : 알파벳 대문자
		// 모든 책들은 사전순으로 정렬되어 있음
		
		// 첫 알파벳 글자를 기준으로 구간을 나누려고 함
		// 동이 : 책 제목의 첫 글자가 무엇이 되느냐가 중요
		// 위치와 각도를 수집하여 가장 많은 책들이 제목의 첫글자로 사용한 알파벳이 무엇인지 조사
		
		// 바라본 구간에서 제목의 첫 글자로 가장 많이 등장한 알파벳을 계산!
		/** 첫번째 줄 : N Q**/
		// N - 10만 이하의 자연수
		// Q - 조사할 구간 20만 이하의 자연수
		/** 두번째 줄 : 첫 글자만 이어붙여 만든 N글자의 문자열**/
		/** 나머지 Q줄**/
		// 구간에 대한 정보가 자연수로 주어짐
		// L R 형식으로 두 자연수로 구성
		// L(왼쪽 끝) <= R(오른쪽 끝)
		// 출력 : 가장 많이 등장한 알파벳 출력
		
		// int : 20억까지 표현 가능
		// 단순히 문자열 슬라이싱 해서 for문으로 count 올려도 될지?
		
		/**/
		
		
		Scanner sc = new Scanner(System.in);
		// 문자열 개수 strNum, 구간 개수 sectNum
		int strNum = sc.nextInt();
		int sectNum = sc.nextInt();
		
		// 문자열 입력받기
		String bookName = sc.next();
		// 정확히 N글자의 알파벳인지 검사
		if(bookName.length() != strNum) {
			while(bookName.length() != strNum) {
				System.out.println("문자열을 정확히 ["+strNum+ "]글자 입력하세요");
				bookName = sc.next();
			}
		}
		for (int i = 0; i < sectNum; i++) {
			int max_index = 0; // solution
			int left = sc.nextInt();
			int right = sc.nextInt();
			// char 배열로 변환
			String checkName = bookName.substring(left-1, right);
//			System.out.println(checkName);
			char[] charArr = checkName.toCharArray();
//			for (int j = 0; j < charArr.length; j++) {
//				System.out.print(charArr[j] + " ");
//			}
			int[] count = new int[checkName.length()];
			// 각 char 중복 수 저장
			for (int j = 0; j < charArr.length; j++) {
				for (int j2 = j+1; j2 < charArr.length; j2++) {
					if(charArr[j] == charArr[j2]) {
						count[j]++;
//						System.out.println("count: " count);
					}
				}
			}
			// count 중 가장 큰 값 출력
			for (int j = 0; j < count.length - 1; j++) {
				if(count[j] < count[j+1]) {
//					System.out.println(count[j]);
					count[j] = count[j+1]; // max 갱신
					max_index = j+1;
				}
			}
			System.out.println(charArr[max_index]);

		}
	}

}
