import java.util.Scanner;

public class Num111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();

		int sum = kor + eng + math + com;
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / 4);
		sc.close();
	}

}