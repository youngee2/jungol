import java.util.Scanner;

public class Num546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum=0;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		avg =(double)sum/n;
		System.out.printf("avg : %.1f \n",avg);
		if(avg>=80) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
