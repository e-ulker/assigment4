package assigment_4_if_switch;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pay;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter call number");
		int call_number=scan.nextInt();
		if(call_number==100) {
			pay=200;
			System.out.println("you will pay 200$");
		}else if(call_number>100 && call_number<=200) {
		       if((call_number-100)<=50) {
		    	   pay=((call_number-100)*(0.6))+200; 
		    	   System.out.println("payment "+pay);
		       }if((call_number-100)>50) {
		    	   pay=(int)((call_number-100)*0.5)+200;
		    	   System.out.println("payment "+pay);
		       }
		}else if(call_number>200) {
			pay=(int)((call_number-200)*(0.4))+200;
			System.out.println("payment"+pay);
		}
	}

}
