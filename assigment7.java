package assigment_4_if_switch;
import java.util.Scanner;
public class assigment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int remainder,remainder2,minute,hour,day;
		
		System.out.println("enter a number of seconds");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		if(number>=60 && number<3600) {
			minute=number/60;
			remainder=number%60;
			System.out.println(number+" seconds = "+minute+" minute "+remainder+" seconds ");
		}else if(number>=3600 && number<86400) {
			hour=number/3600;
			remainder=number%3600;
			if(remainder<60) {
				System.out.println(number+" seconds = "+hour+" hour "+remainder+" seconds");
			}else if(remainder>=60) {
				minute=remainder/60;
				remainder2=remainder%60;
				System.out.println(number+" seconds = "+hour+" hour "+minute+" minute "+remainder2+" seconds");
			}
		}else if(number>=86400) {
			day=number/86400;
			remainder=number%86400; //seconds
			if(remainder<60) {
				System.out.println(number+" seconds= "+day+" day "+remainder+" seconds ");
			}else if(remainder>=60) {
				minute=remainder/60;  //minute
				remainder2=remainder%60; //second
				System.out.println(number+" seconds= "+day+" day "+minute+" minute "+remainder2+" seconds");
			}
		}
		
		
		
		
		
		
	}

}
