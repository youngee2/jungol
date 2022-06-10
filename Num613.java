import java.util.Scanner;

class Ex{
	String name,school;
	int grade;
	
	void method(String name, String school, int grade) {
//			for(int i=0; i<=5; i++) {
//				System.out.println(name.charAt(i));
			}
		}
//	}

public class Num613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex e = new Ex();
		e.name=sc.next();
		e.school=sc.next();
		e.grade=sc.nextInt();
		System.out.printf("Name : %.20s \n",e.name);
		System.out.printf("School : %.20s \n",e.school);
		System.out.println("Grade : "+e.grade);
		System.out.println();
		sc.close();
	}
}