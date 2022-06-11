import java.util.Scanner;

public class Num533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char sex = sc.next().charAt(0);
		int age = sc.nextInt();

		if (sex == 'M' && age >= 18) {
			System.out.println("MAN");
		} else if (sex == 'F' && age >= 18) {
			System.out.println("WOMAN");
		} else if (sex == 'M' && age < 18) {
			System.out.println("BOY");
		} else if (sex == 'F' && age < 18) {
			System.out.println("GIRL");
		}
		sc.close();
	}

}