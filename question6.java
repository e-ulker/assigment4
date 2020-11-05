package assigment_4_if_switch;
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double weight=0;
		System.out.println("enter mass(kg),please");
		int mass=scan.nextInt();
		weight=(mass*9.8);
		
		if(weight>=1000) {
			System.out.println("it is heavy ");
		}else if(weight<=10){
			System.out.println("it is too light");
		}else {
			System.out.println("it is normal");
		}

	}

}
