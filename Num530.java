import java.util.Scanner;

public class Num530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=20) {
			System.out.println("adult");
		}else {
			System.out.println(20-age+" years later");
		}
		sc.close();
	}
}