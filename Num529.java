import java.util.Scanner;

public class Num529 {
//	��������+100-Ű���� �񸸼�ġ �����̶�� ����.
//
//	Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� �񸸼�ġ�� ����ϰ�,
//	�񸸼�ġ�� 0���� ũ�� �����ٿ� ��("Obesity")�̶�� �޽����� 
//	����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	(��������� �Ʒ� ��� ���� �����ϼ���.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();

		int obesity = weight + 100 - height;
		System.out.println(obesity);
		if (obesity > 0)
			System.out.println("Obesity");
		sc.close();
	}

}
