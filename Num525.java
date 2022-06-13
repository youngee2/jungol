import java.util.Scanner;

public class Num525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		boolean n = ((num1 > num2 && num1 > num3)) ? true : false;
		boolean n1 = (num1 == num2&& num2 == num3) ? true : false;

		System.out.printf("%b %b", n, n1);
		sc.close();
	}

}