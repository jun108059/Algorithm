package programmers;
import java.lang.String;
/* 
 * Programmers Skill Check 레벨  1
 * 정수를 입력받아 정수 조합 중 가장 큰 값으로 반환하는 문제
 * 2019-09-02
 */
public class Skill_check_2 {
	  public long solution(long n) {
	      // Sorting
	      // 1. long -> string -> string compare -> long?
	      String str = String.valueOf(n); // to String
	      // or String str = new Long(n).toString();
	      String [] data = str.split("");
	      for(int i = 0; i < data.length-1; i++) {
	          // position change
	          for(int k = i; k < data.length-1; k++) {
	              if(Integer.parseInt(data[i]) < Integer.parseInt(data[k+1])) {
	                String temp = data[i];
	                data[i] = data[k+1];
	                data[k+1] = temp;
	              }
	          }
	      }
	      // Array to String
	      String str_temp = "";
	      for(int i = 0; i < data.length; i++) {
	          str_temp = str_temp.concat(data[i]);
	      }
	      // String to Long
	      long answer = Long.parseLong(str_temp);
	      return answer;
	  }
}
