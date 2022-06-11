import java.util.Scanner;

public class Num535 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double score = sc.nextDouble();
		
		switch((int)score) {
		case (int)4.0:
			System.out.println("scholarship");
			break;
		case (int)3.0:
			System.out.println("next semester");
			break;
		case (int)2.0:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
		}
		sc.close();
	}
}