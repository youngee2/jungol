import java.util.Scanner;

public class Num156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int min = 1, max = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if (arr[i] == 999) {
				break;
			}

			min = (min < arr[i]) ? min : arr[i];
			max = (max > arr[i]) ? max : arr[i];

		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		sc.close();
	}

}