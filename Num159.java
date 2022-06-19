import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int num = sc.nextInt();
		Integer[] score = new Integer[num];
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score, Collections.reverseOrder());
		sc.close();

		for (int j = 0; j < score.length; j++) {
			System.out.println(score[j]);
		}
	}
}