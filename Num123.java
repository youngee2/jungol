import java.util.Scanner;
//1
public class Num123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int animal = sc.nextInt();

		switch (animal) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
		sc.close();
	}

}
