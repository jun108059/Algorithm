package Lv1_2;
/*
 * JadenCase ���ڿ� �����

JadenCase�� ��� �ܾ��� ù ���ڰ� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ��Դϴ�. 
���ڿ� s�� �־����� ��, s�� JadenCase�� �ٲ� ���ڿ��� �����ϴ� �Լ�, 
solution�� �ϼ����ּ���.

���� ����
s�� ���� 1 �̻��� ���ڿ��Դϴ�.
s�� ���ĺ��� ���鹮��(" ")�� �̷���� �ֽ��ϴ�.
ù ���ڰ� ������ �ƴҶ����� �̾����� ������ �ҹ��ڷ� ���ϴ�. ( ù��° ����� �� ���� )

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
		// Jaden���� check true=ù����
		boolean checkJaden = false;
		
		jadenArray[0] = jadenArray[0].toUpperCase();
		for (int i = 1; i < jadenArray.length; i++) {

			// ���� ���ڰ� ������ �ƴ�, �˻��� ���ڵ� ������ �ƴ�
			if(jadenArray[i].equals(" ")) {
				checkJaden = true;
			}
			// ���� �̹� ���ڰ� �����̶�� (���� ���� üũ�� �ʿ� ������?)
			else if(checkJaden == false && !jadenArray[i].equals(" ")) {
				jadenArray[i] = jadenArray[i].toLowerCase();
			}
			// �����̸鼭 ù ���ڶ��
			else if(checkJaden == true) {
				jadenArray[i] = jadenArray[i].toUpperCase();
				checkJaden = false;
			}
		}
		for (int i = 0; i < jadenArray.length; i++) {
			answer = answer + jadenArray[i];
		}
		

//	    System.out.println(answer);
	    // ���ڿ� String �迭�� ��ȯ (split)
	    
	    // String �迭 �ϳ��� �˻�
	    // ���� ������ ������ ������ �빮���϶� �ҹ��ڷ�
	    // ���� ������ �ѹ��� �빮��ȭ �� ��� �ҹ���
	    
	    return answer;
    }
	
}
