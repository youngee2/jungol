import java.util.Scanner;

public class Num520{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%d\n%d",num++,++num);
		sc.close();
	}

}