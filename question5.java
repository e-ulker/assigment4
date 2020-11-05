package assigment_4_if_switch;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a month number");
		int month=scan.nextInt();
		
		System.out.println("Please,enter a day number");
		int day=scan.nextInt();
		
		System.out.println("enter a year number please,2 digit:)");
		int year=scan.nextInt();
		
		if((day*month)==year) {
			System.out.println(month+"/"+day+"/"+year+ "  it is MAGÝC DATE <3<3<3 :)))");
		}else {
			System.out.println("it is not magic day");
		}
		
	}

}
