import java.util.Scanner;

public class Num127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, count=0;
		while(true) {
			int num = sc.nextInt();
			if(num>=0&&num<=100) {
				sum+=num;
				count++;
			}else {
				System.out.println("sum : "+ sum);
				System.out.printf("avg : %.1f",(float)sum/count);
				sc.close();
				break;
			}
		
		}

	}

}