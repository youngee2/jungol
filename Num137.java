import java.util.Scanner;

public class Num137 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=1; i<=num1; i++) {
			System.out.println("");
			for(int j=1; j<=num2; j++) {
				System.out.print(i*j+" " );
			}
		}
		sc.close();
	}

}
