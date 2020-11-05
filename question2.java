package assigment_4_if_switch;

import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pay;
		Scanner scan=new Scanner(System.in);
		System.out.println("your income:");
		double income=scan.nextDouble();
		
		if(income<=150_000_000) {
			pay=(income)*(25/100);
			System.out.println("The tax amount you have to pay"+pay);
		}else if(income<=300_000_000) {
			pay=(income-150_000_000)*(0.3)+(150_000_000)/4;
			System.out.println("The tax amount you have to pay"+pay);
		}else if(income<=600_000_000) {
			pay=((income-300_000_000)*0.35)+(300_000_000-150_000_000)*0.3+150_000_000/4;
			System.out.println("The tax amount you have to pay"+pay);
		}else if(income<=1_200_000_000) {
		pay=((income-600_000_000)*0.4)+((600_000_000-300_000_000)*0.35)+((300_000_000-150_000_000)*(0.3))+(150_000_000/4);
		System.out.println("The tax amount you have to pay"+pay);
		}else if(income>1_200_000_000) {
			pay=(income-1_200_000_000*(50/100))+(1_200_000_000*0.4)+((600_000_000-300_000_000)*0.35)+((300_000_000-150_000_000)*(0.3))+(150_000_000/4);
			System.out.println("The tax amount you have to pay"+pay);
		}

		
		
		
		
	}

}
