import java.util.Scanner;

public class Num558 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[100]; //100���� ������ ������ �� �ִ� �迭 ����
		for (int i = 0; i < num.length; i++) { //i�� 0�̰� 100���� �����ϸ鼭 ���� �迭�� ����
			num[i] = sc.nextInt();

			if (num[i] == 0) //���� num�� 0�Ͻ� for������ ����������.
				break;
		}
		sc.close();
		for (int i = num.length - 1; i >= 0; i--) { //i�� 100-1�� 0���� ũ�ų� ������ �ݺ�!
													//i--�� �������� ���
			if (num[i] != 0)						// 0�� �ƴ� �͸� ����Ѵ�.
				System.out.print(num[i] + " ");
		}
	}
}