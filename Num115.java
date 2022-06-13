import java.util.Scanner;

public class Num115{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cm1 = sc.nextInt();
		int kg1 = sc.nextInt();
		int cm2 = sc.nextInt();
		int kg2 = sc.nextInt();
		
		boolean b = (cm1>cm2 && kg1>kg2)?true:false;
		System.out.println(b);
		sc.close();
	}

}