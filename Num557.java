import java.util.Scanner;

public class Num557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char num[] = new char[10];
		for (int i = 0; i < 10; i++) {
			num[i] = sc.next().charAt(0);

		}
		System.out.println(num[0] + " " + num[3] + " " + num[6]);
		sc.close();

	}
}
