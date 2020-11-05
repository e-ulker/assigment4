package assigment_4_if_switch;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year");
		int year=scan.nextInt();
     
		if((year%100==0)&&(year%400==0)) {
			System.out.println(year+"Leap Year");
		}else if(year%4==0) {
			System.out.println(year+" "+"Leap Year");
		}else {
			System.out.println("it is not Leap Year");
		}
		
		
		
		
		

	}

}
