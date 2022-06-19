import java.util.Scanner;

public class Num154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] weight = new double[6];
		double sum = 0;
		int count = 0;
		for (int i = 0; i < weight.length; i++) {
			weight[i] = sc.nextDouble();
			sum += weight[i];
			count++;
		}
		System.out.printf("%.1f", sum / count);
		sc.close();
	}

}
