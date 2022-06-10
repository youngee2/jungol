import java.util.Scanner;

public class Num555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	내가 작성한 String으로 작성하는 소스코드
//		String[] num = new String[10];
//		
//		for(int i=0; i<=9; i++) {
//			num[i] = sc.next();
//			System.out.printf("%s",num[i]);
//	강사님이 작성한 char으로 작성하는 소스코드
		char[] arr = new char[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
