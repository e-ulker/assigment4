package assigment_4_if_switch;
import java.util.Scanner;
public class question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your check number");
		int check=scan.nextInt();
		double price;
		int basefee=10;
		
		if(check<=20) {
			price=check*0.1;
			System.out.println(check+" check's price="+(price+basefee)+"$");
		}else if(check>=21 && check<=39) {
			price=check*0.08;
			System.out.println(check+" check's price="+(price+basefee)+"$");
		}else if(check>=40 && check<=59) {                                       // && ve || farkýna dikkat et !!!
			price=check*0.06;
			System.out.println(check+" check's price="+(price+basefee)+"$");
		}else if(check>=60) {
			price=check*0.04;
			System.out.println(check+"check's price="+price+"$");
		}
		
		
		

	}

}
