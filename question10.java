package assigment_4_if_switch;
import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int percent;
		
		System.out.println("enter kalori");
	Scanner scan=new Scanner(System.in);
	int kalori=scan.nextInt();
	
	System.out.println("enter fat grams");
	int gram=scan.nextInt();
		
		percent=100*(gram*9)/kalori;

		
		if(percent<(kalori*0.3)) {
			System.out.println("food is low in fat");
		}if((gram*9)>kalori) {
			System.out.println("input is invalid");
		}
		
		System.out.println("percent of calories from fat "+percent);

		
	}

}
