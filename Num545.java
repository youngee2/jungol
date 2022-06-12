import java.util.Scanner;

public class Num545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int num3 = 0;
		int num5 = 0;

		for (int i = 0; i<10; i++) {
			num[i]=sc.nextInt();
			if (num[i] % 3 == 0) {
				num3++;
			}
			if (num[i] % 5 == 0) {
				num5++;
			}
		}
			System.out.println("Multiples of 3 : " + num3);
			System.out.println("Multiples of 5 : " + num5);
		
		sc.close();
	}
}