package lv2;
import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1983] 조교의 성적 매기기
 * 입력으로 각각의 학생들의 중간, 기말, 과제 점수가 주어지고,
 * 학점을 알고싶은 K 번째 학생의 번호가 주어졌을 때,
 * K 번째 학생의 학점을 출력하는 프로그램을 작성하라.
 */

public class N1983 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double mid = 0, fin = 0, ass = 0;					// 중간 기말 과제
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();		  // 테스트케이스 수
        
        // 테스트 케이스만큼 loop
        for(int test_case = 1; test_case < scanNum + 1; test_case++) {
        	int studentNum = scanner.nextInt(); // 학생 수
            int search = scanner.nextInt(); // 학점이 궁금한 학생
            int count = 0; // loop에 count
            int persent = studentNum / 10;
            double student_arr[] = new double[studentNum];
            while (count < studentNum) {  
               	mid = scanner.nextInt();
                fin = scanner.nextInt();
                ass = scanner.nextInt();
                student_arr[count] = (mid * 0.35) + (fin * 0.45) + (ass * 0.20);
                count++; // 다음 학생 배열 접근
            }
            double sort_student_arr[] = new double[studentNum]; // sorting할 배열 생성
            for (int i = 0; i < student_arr.length; i++) {
    	        sort_student_arr[i] = student_arr[i];
            }
            // sort
            for (int i = 0; i < sort_student_arr.length; i++) {
                for (int k = i; k <  sort_student_arr.length; k++) {
                    if (sort_student_arr[i] < sort_student_arr[k]){
                        double temp = sort_student_arr[k];
                        sort_student_arr[k] = sort_student_arr[i];
                        sort_student_arr[i] = temp;
                    }
                }
            }
            // 해당 학생 등수 구하기
            int rank = 0;
            String grade = null; // 학생 학점 
            for (int i = 0; i < student_arr.length; i++) {
    	    	if (student_arr[search-1] == sort_student_arr[i]) {
                    rank = i+1;
                }
            }
            // 학점 구하기
            if (rank <= persent) {
                grade = "A+";
            }
            else if (rank <= persent*2) {
                grade = "A0";
            }
            else if (rank <= persent*3) {
                grade = "A-";
            }
            else if (rank <= persent*4) {
                grade = "B+";
            }
            else if (rank <= persent*5) {
                grade = "B0";
            }
            else if (rank <= persent*6) {
                grade = "B-";
            }
            else if (rank <= persent*7) {
                grade = "C+";
            }
            else if (rank <= persent*8) {
                grade = "C0";
            }
            else if (rank <= persent*9) {
                grade = "C-";
            }
            else if (rank <= persent*10) {
                grade = "D0";
            }
            System.out.println("#" + test_case + " " + grade);
        }
	}
}
