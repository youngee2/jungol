import java.util.Scanner;

public class Num129 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base,height;
		char ch;
		do {
			System.out.print("Base = ");
			 base = sc.nextInt();
			System.out.print("Height = ");
			 height = sc.nextInt();
			System.out.printf("Triangle width = %.1f \n",(double)base*height/2);
			System.out.print("Continue? ");
			 ch = sc.next().charAt(0);
		}
	
		while(ch=='Y'|| ch=='y') ;
			
		}
	}