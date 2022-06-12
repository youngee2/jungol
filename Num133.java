import java.util.Scanner;

public class Num133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		if (num <= 100) {
			for (int i = 0; i < num; i++) {
				sum += sc.nextInt();
			}
			System.out.printf("%.2f", (double) sum / num);
		}
		sc.close();
	}

}
