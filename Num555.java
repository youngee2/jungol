import java.util.Scanner;

public class Num555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	���� �ۼ��� String���� �ۼ��ϴ� �ҽ��ڵ�
//		String[] num = new String[10];
//		
//		for(int i=0; i<=9; i++) {
//			num[i] = sc.next();
//			System.out.printf("%s",num[i]);
//	������� �ۼ��� char���� �ۼ��ϴ� �ҽ��ڵ�
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
