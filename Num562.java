import java.util.Scanner;

public class Num562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr=new int[10];
		int sum=0, sum1=0,count=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if(i%2!=0) {
				sum+=arr[i];
			}
			else {
				sum1+=arr[i];
				count++;
			}
			
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",(double)sum1/count);
		sc.close();
	}

}
