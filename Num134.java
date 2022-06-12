import java.util.Scanner;

public class Num134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0, odd = 0;
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			}
			if (num % 2 != 0) {
				odd++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
		sc.close();
	}

}
