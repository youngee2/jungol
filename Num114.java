import java.util.Scanner;

public class Num114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.printf("%d %d \n", ++num1, num2--);
		System.out.printf("%d %d \n", num1, num2);
		sc.close();
	}

}