import java.util.Scanner;

public class Num153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			
			if (num[i] == -1 && i == 2) {
				System.out.printf("%d %d ", num[i - 2], num[i - 1]);
				break;
				
			} else if (num[i] == -1 && i == 1) {
				System.out.printf("%d ", num[i - 1]);
				break;
				
			} else if (num[i] == -1) {
				System.out.printf("%d ", num[i - 3]);
				System.out.printf("%d ", num[i - 2]);
				System.out.printf("%d ", num[i - 1]);
				break;
			}
		}
		sc.close();
	}
}