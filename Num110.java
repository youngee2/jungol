import java.util.Scanner;

public class Num110 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("yard? ");
	double yard=sc.nextDouble();
	System.out.printf("%.1fyard = %.1fcm",yard,yard*91.44);
	sc.close();

	}

}
