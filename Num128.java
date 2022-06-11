import java.util.Scanner;

public class Num128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		while(true) {
			int num = sc.nextInt();
			
			if(!(num%3==0 || num%5==0)) {
				count++;
			}else if(num==0) {
				System.out.println(count);
				sc.close();
				break;
			}
		}
	}
}