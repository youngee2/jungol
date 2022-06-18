import java.util.Scanner;

public class Num555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = new char[10];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
