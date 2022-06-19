import java.util.Scanner;

public class Num157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];
		int count = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] != 0 && arr[i] % 5 == 0) {
				count++;
				sum += arr[i];
			} else if (arr[i] == 0) {
				sc.close();
				System.out.printf("Multiples of 5 : %d \n", count);
				System.out.println("sum : " + sum);
				System.out.printf("avg : %.1f", (double) sum / count);
				break;
			}
		}

	}

}