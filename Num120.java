import java.util.Scanner;

public class Num120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 - num2);
		} else {
			System.out.println(num2 - num1);
		}
		sc.close();
	}

}