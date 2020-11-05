package assigment_4_if_switch;
import java.util.Scanner;
public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Scanner scan=new Scanner(System.in);
		   System.out.println("please enter your books number");
		   int number=scan.nextInt();
		   
		   switch(number) {
		   
		   case 0 :
			   System.out.println("he or she earns 0 points.");
			   break;
		   case 1:
			   System.out.println("he or she earns 5 points.");
			   break;
		   case 2:
			   System.out.println("he or she earns 15 points.");
			   break;
		   case 3:
			   System.out.println("he or she earns 30 points.");
			   break;
		   default:
			   System.out.println("he or she earns 60 points.");
			   break;
		   }
		
		
		
		
	}

}
