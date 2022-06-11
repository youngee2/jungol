import java.util.Scanner;

public class Num632 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
//num1이 num2보다 작다면 num1을 min에 넣고 아니면 num2를 min에 대입
		int min=(num1<num2) ? num1:num2;
		//작은값과 나머지값을 비교하는데 min이 num3보다 크다면 작은 수를 
		//출력해야 하므로 num3을 출력
		System.out.println((min>num3)?num3:min);
	}
}
