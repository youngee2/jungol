import java.util.Scanner;

public class Num523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		boolean a = (num1 > num2) ? true : false;
		boolean a1 = (num1 < num2) ? true : false;
		boolean a2 = (num1 >= num2) ? true : false;
		boolean a3 = (num1 <= num2) ? true : false;

		System.out.println(num1 + " > " + num2 + " --- " + a);
		System.out.println(num1 + " < " + num2 + " --- " + a1);
		System.out.println(num1 + " >= " + num2 + " --- " + a2);
		System.out.println(num1 + " <= " + num2 + " --- " + a3);

		sc.close();
	}

}