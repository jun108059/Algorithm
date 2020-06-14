import java.util.Scanner;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;
		String pwdCheck;
		id = sc.next();
		pwd = sc.next();
		pwdCheck = sc.next();
		checkIdPwd(id, pwd, pwdCheck);
		sc.close();
	}
	public static void checkIdPwd(String id, String pwd, String pwdCheck) {
	      // id는 3글자 이상 20글자 이하 영어소문자랑 숫자만
	      // pwd는 8글자 이상, 20글자 이하 알파벳 대/소문자, 숫자 특수기호(!@#$) 사용
	      // 알파벳, 숫자 , 특수기호 각각 하나 이상 반드시 사용
	      
	      if(Pattern.matches("^[a-z0-9]{3,20}$",id)
	            &&Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@!#])[A-Za-z\\d$@$!#]{8,20}$",pwd)
	               &&pwd.equals(pwdCheck)) {
	         System.out.println("pass");
	      }
	      else {
	         System.out.println("fail");
	      }
	   }
}

