import java.util.Scanner;

public class Num539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		배열로 할 경우
		int sum = 0;
		int i=0;
		int[] arr = new int[100];
		do {
		arr[i] = sc.nextInt();
		}while (arr[i++]<100);
			sc.close();
			
			for ( int j = 0; j <i; j++) {
				sum+=arr[j];

				
			}
			System.out.println(sum);
			System.out.printf("%.1f \n",(double)sum/i);
	}
}
//		반복문 while 이용해서 출력 
//		int sum = 0, cnt = 0, inp = 0;
//		while (inp < 100) {
//			inp = sc.nextInt();
//			sum += inp;
//			cnt++;
//		}
//		sc.close();
//		System.out.println(sum);
//		System.out.printf("%.1f", (double) sum / cnt);
//	}
//}