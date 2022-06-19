import java.util.Scanner;

public class Num150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = new char[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		for (int j = arr.length - 1; j > -1; j--) {
			System.out.print(arr[j] + " ");
		}
		sc.close();
	}

}
