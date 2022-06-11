import java.util.Scanner;

public class Num539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		while (true) {
			int num = sc.nextInt();
			sum += num;
			count++;
			if (num >= 100) {
				System.out.println(sum);
				System.out.printf("%.1f", (double) sum / count);
				break;

			}
		}
		sc.close();
	}

}