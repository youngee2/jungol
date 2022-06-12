import java.util.Scanner;

public class Num138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println();
			for (int j = 1; j <= num; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
		}
		sc.close();
	}
}