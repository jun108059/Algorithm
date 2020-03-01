package programmers;
/*
 * JadenCase 문자열 만들기

JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, 
solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )

3people unFollowed me >> 3people Unfollowed Me
for the last week >> For The Last Week
*/

public class JadenCase {

	public static void main(String[] args) {
		String answer = "apEOple  unF";
		solution(answer);
	}

	static String solution(String s) {
		String[] jadenArray;
		String answer = "";
		jadenArray = s.split("");
		// Jaden인지 check true=첫글자
		boolean checkJaden = false;
		
		jadenArray[0] = jadenArray[0].toUpperCase();
		for (int i = 1; i < jadenArray.length; i++) {

			// 이전 글자가 공백이 아님, 검사한 글자도 공백이 아님
			if(jadenArray[i].equals(" ")) {
				checkJaden = true;
			}
			// 만약 이번 글자가 공백이라면 (이전 글자 체크할 필요 없는지?)
			else if(checkJaden == false && !jadenArray[i].equals(" ")) {
				jadenArray[i] = jadenArray[i].toLowerCase();
			}
			// 글자이면서 첫 글자라면
			else if(checkJaden == true) {
				jadenArray[i] = jadenArray[i].toUpperCase();
				checkJaden = false;
			}
		}
		for (int i = 0; i < jadenArray.length; i++) {
			answer = answer + jadenArray[i];
		}
		

//	    System.out.println(answer);
	    // 문자열 String 배열로 변환 (split)
	    
	    // String 배열 하나씩 검사
	    // 다음 공백을 만나기 전까지 대문자일때 소문자로
	    // 공백 만나면 한번만 대문자화 후 계속 소문자
	    
	    return answer;
    }
	
}
