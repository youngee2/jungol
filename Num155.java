import java.util.Scanner;

public class Num155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };
		char ch = sc.next().charAt(0);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.println(i);
				break;
			} else {
				count++;
			}
		}
		if (count == 6) {
			System.out.println("none");
		}
		sc.close();

	}
}