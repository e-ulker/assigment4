package assigment_4_if_switch;
import java.util.Scanner;
public class assigment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double discount,net,total;
		int money=100;
		System.out.println("how many package  buy?");
		Scanner scan=new Scanner(System.in);
		double quantity=scan.nextDouble();
		
		if(quantity>=10 && quantity<=19 ) {
			total=quantity*money;
			discount=quantity*money*20/100; // 10 girince discount=19.0 diyor.Neden 19.8 demedi??? Float tanýmladým.
			net=total-discount;
			System.out.println("before discount ="+total+"  after discount ="+net+" total discount ="+discount);
		}else if(quantity>=20 && quantity<=49){
			total=quantity*money;
			discount=quantity*money*30/100; // 20 girince neden discount 29 olmuyor da 19 oluyor?
			net=total-discount;
			System.out.println("before discount ="+total+"  after discount ="+net+" total discount ="+discount);
		}else if(quantity>=50 && quantity<=99) {
			total=quantity*money;
			discount=quantity*money*40/100;
			net=total-discount;
			System.out.println("before discount ="+total+"  after discount ="+net+" total discount ="+discount);
		}else if(quantity>=100) {
			total=quantity*money;
			discount=quantity*money*50/100;
			net=total-discount;
			System.out.println("before discount ="+total+"  after discount ="+net+" total discount ="+discount);
		}
		else {
			System.out.println("no discount");
		}
		
	}

}
