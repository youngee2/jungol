import java.util.Arrays;
import java.util.Scanner;

public class Num560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		Arrays.sort(arr);
		System.out.print(arr[0]);
		sc.close();
	}

}
