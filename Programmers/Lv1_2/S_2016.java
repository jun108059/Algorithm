package Lv1_2;

public class S_2016 {

	public static void main(String[] args) {
		String abc = getDayName(5, 24);
		System.out.println(abc);
	}
	
    static String getDayName(int a, int b) {
        String answer = "";
        // 1월 1일이 금요일이기 때문에 FRI 먼저
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        // 윤년 포함 매달 말일 배열
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sumOfDate = 0;
        // 입력받은 달까지 date 더하기
        for (int i = 0; i < a - 1; i++) {
        	sumOfDate += date[i];
        }
        // 해당 날짜에 남은 date 더한 후 요일 계산
        sumOfDate = sumOfDate + b - 1;
        answer = day[sumOfDate % 7];

        return answer;
    }

}
