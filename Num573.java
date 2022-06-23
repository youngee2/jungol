import java.util.Scanner;

class Num {
	int n;

	void print() {

		for (int i = 1; i <= n * n; i++) {
			System.out.print(i + " ");
			if (i % n == 0) {
				System.out.println();
			}

		}

	}
}

public class Num573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Num m = new Num();
		m.n = sc.nextInt();
		m.print();

		sc.close();
	}

}
