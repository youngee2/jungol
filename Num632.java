import java.util.Scanner;

public class Num632 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
//num1�� num2���� �۴ٸ� num1�� min�� �ְ� �ƴϸ� num2�� min�� ����
		int min=(num1<num2) ? num1:num2;
		//�������� ���������� ���ϴµ� min�� num3���� ũ�ٸ� ���� ���� 
		//����ؾ� �ϹǷ� num3�� ���
		System.out.println((min>num3)?num3:min);
	}
}
