import java.util.Scanner;

public class Num2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) { //Çà
			for (int j = 0; j <= i; j++) { //¿­a
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
