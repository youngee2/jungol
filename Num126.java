import java.util.Scanner;

public class Num126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int odd=0,even=0;
		while(true) {
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("odd : "+odd);
				System.out.println("even : "+even);
				sc.close();
				break;
			}else if(num%2!=0) {
				odd++;
			}else if(num%2==0) {
				even++;
			}
		}
	}

}
