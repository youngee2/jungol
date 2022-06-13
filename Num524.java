import java.util.Scanner;

public class Num524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		boolean b = (num1 != 0) ? true : false;
		boolean b1 = (num2 != 0) ? true : false;
		System.out.printf("%b %b", b && b1, b || b1);
		sc.close();
	}

}