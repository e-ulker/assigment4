package assigment_4_if_switch;
import java.util.Scanner;
public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter distance please");
		double distance=scan.nextDouble();
		
		System.out.println("please enter for \"air\",\"water\" or \"steel\"");
		String variable=scan.next();
		
		
		switch(variable){
		
		case "air"  :
			
			double time=distance/1100; 
			System.out.println("time="+time); 
			break;
			
		case "water" :
			time=distance/4900;
			System.out.println("time="+time);
			break;
			
		case "steel":
			time=distance/16400;
			System.out.println("time="+time);
			break;
		}
		
		

		
		
	}

}
