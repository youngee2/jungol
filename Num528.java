import java.util.Scanner;

public class Num528 {
//	������ �Է¹޾� ù �ٿ� �Է� ���� ���ڸ� ����ϰ� 
//	��° �ٿ� �����̸� ��minus�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		if (num < 0) {
			System.out.println("minus");
		}
		sc.close();
	}

}
