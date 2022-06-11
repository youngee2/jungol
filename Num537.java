import java.util.Scanner;

public class Num537 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num = sc.nextInt();
		while (100 >= num) {
			sc.close();
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(sum);
			break;
		}

	}
}
