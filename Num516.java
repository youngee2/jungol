import java.util.Scanner;

public class Num516 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.printf("%.2f\n%.2f\n%c",d1,d2,ch);
		sc.close();
	}

}
