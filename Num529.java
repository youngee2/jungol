import java.util.Scanner;

public class Num529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		int kg = sc.nextInt();
		int m = kg + 100 - cm;
		sc.close();
		System.out.println(m);
		if (m > 0) {
			System.out.println("Obesity");
		}
	}
}