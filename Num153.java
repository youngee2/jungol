import java.util.Scanner;

public class Num153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == -1 && i > 3) {

				System.out.printf("%d %d %d", arr[i - 3], arr[i - 2], arr[i - 1]);
				break;
			} else if (arr[i] == -1 && i == 2) {

				System.out.printf("%d %d ", arr[i - 2], arr[i - 1]);
				break;
			} else if (arr[i] == -1 && i == 1) {

				System.out.printf("%d ", arr[i - 1]);
				break;
			}
		}
		sc.close();
	}
}