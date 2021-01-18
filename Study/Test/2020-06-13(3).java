import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int mode;
		int popNum;
		int stackArr[];
		int top = -1;
		int countUnderflow = 0;
		int countOverflow = 0;
		// 데이터 입력 횟수 num
		num = sc.nextInt();
		// stack을 배열로 선언
		stackArr = new int[num];
		for(int i = 0; i < num; i++) {
			mode = sc.nextInt();
			// PUSH
			if(mode == 0) {
				popNum = sc.nextInt();
				stackArr[++top] = popNum;
				if (top > num) {
					countOverflow++;
				}
			}
			// POP
			else if (mode == 1) {
				if (top == -1) {
					countUnderflow++;
				} else {
					stackArr[top--] = 0;
				}
			}
			// 0또는 1이외의 것을 입력하면 프로그램을 종료
			else {
				break;
			}
		}

		for (int i = 0; i < stackArr.length; i++) {
			if (stackArr[i] != 0) {
				System.out.print(stackArr[i] + " ");
			}
		}
		if (countUnderflow > 1) {
			for (int i = 0; i < countUnderflow; i++) {
				System.out.println("underflow");
			}
		}
		if (countOverflow > 1) {
			System.out.println("overflow");
		}
		sc.close();
	}
}
