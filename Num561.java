import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num561 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		Integer num1[]=new Integer[10];
		int min = 0, max = 0,count=0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			num1[i]=num[i];
		}
		Arrays.sort(num);
		for (int j = 0; j < num.length; j++) {
			if (num[j] < 100&&num[j]>=1) {
				min = num[j];
				count++;
			}else if(min==0) {
				min=100;
			}
			
			Arrays.sort(num1,Collections.reverseOrder());
			if (num[j] >= 100 && num[j]<10000) {
				max = num1[j-count];
			}else if(max==0) {
				max=100;
			}
		}
		System.out.printf("%d %d ", min, max);
		sc.close();
	}
}