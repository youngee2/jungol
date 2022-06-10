import java.util.Scanner;

public class Num558 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[100]; //100개의 정수를 저장할 수 있는 배열 선언
		for (int i = 0; i < num.length; i++) { //i는 0이고 100까지 증가하면서 값을 배열에 저장
			num[i] = sc.nextInt();

			if (num[i] == 0) //만약 num에 0일시 for문에서 빠져나간다.
				break;
		}
		sc.close();
		for (int i = num.length - 1; i >= 0; i--) { //i는 100-1에 0보다 크거나 같으면 반복!
													//i--는 역순으로 출력
			if (num[i] != 0)						// 0이 아닌 것만 출력한다.
				System.out.print(num[i] + " ");
		}
	}
}