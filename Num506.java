//		//방법 1 (입력받아서 출력)
//import java.util.Scanner;
//
//public class Num506 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		double w = sc.nextDouble();
//		
//		System.out.printf("My height \n%d\n",h);
//		System.out.printf("My weight \n%.6f",w);
//		
//		
//		
//	}
//
//}

//	방법 2 (단순하게 println으로만 출력)
//public class Num506 {
//
//	public static void main(String[] args) {
//		System.out.println("My height\r\n" + "170\r\n" + "My weight\r\n"
//	+ "68.600000");
//	}
//}

// 방법 3 (변수에 값 대입해서 출력 
public class Num506 {

	public static void main(String[] args) {
		int h = 170;
		double w = 68.6;
//		System.out.println("My height \n"+h+"\nMy weight\n"+w);
		System.out.printf("My height \n%d\nMy weight \n%f",h,w);
	}
}