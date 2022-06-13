import java.util.Scanner;

public class Num522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		boolean n = (num1==num2)? true:false;
		boolean n1 = (num1==num2)? false:true;
		
		System.out.printf("%b \n%b",n,n1);
		sc.close();
	}

}