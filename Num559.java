import java.util.Scanner;

public class Num559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		double[] arr = { 0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		System.out.printf("%.1f", arr[num] + arr[num1]);

		sc.close();
	}
}
