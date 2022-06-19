import java.util.Scanner;

public class Num158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		int i = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] != 0) {
				count++;
			} else if (arr[i] == 0) {
				sc.close();
				break;
			}
		}
		System.out.printf("%d \n", count);

		for (int j = 0; j < i; j++) {
			if (arr[j] % 2 == 0) {
				System.out.printf("%d ", arr[j] / 2);
			} else if (arr[j] % 2 != 0) {
				System.out.printf("%d ", arr[j] * 2);
			}
		}
	}
}
