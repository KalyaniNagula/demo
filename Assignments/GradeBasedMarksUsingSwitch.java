package Assignments;
import java.util.Scanner;
public class GradeBasedMarksUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total marks");
		int totalmarks=sc.nextInt();
		switch(totalmarks/10) {
		case 9:
		case 8:
			System.out.println("Grade A ");
			break;
		case 7:
		case 6:
			System.out.println("Grade B");
			break;
		case 5:
		case 4:
			System.out.println("Grade C");
			break;
		case 3:
		case 2:
		case 1:
			System.out.println("Grade D");
			break;
		
		default:
			System.out.println("Fail");
	}

}
}
