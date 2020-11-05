package assigment_4_if_switch;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double bmi,mass,heigh1;
		
		System.out.println("enter weight pound form");
	    double weight=scan.nextDouble();
	    
	    System.out.println("enter heigh firstly feet and secondly inç form");
	    
	    double heigh=scan.nextDouble();
	    double feet = scan.nextDouble();
	    System.out.println("Your height in feet followed by a space then additional inches:");
		
		heigh += feet * 12;
	    
	    mass=weight/2.2; // sorudaki 5 5----> 5.5 değil 5 feet 5 inç demek.
	    heigh1=heigh*0.0254;
	    bmi=mass/(heigh1*heigh1);
	    System.out.println("mass"+mass);
	    System.out.println("heigh"+heigh1);
	    System.out.println("bmi"+bmi);
	    
	    if(bmi<18.5) {
			System.out.println("underweight "+bmi);
		}else if((bmi>=18.5)&&(bmi<25)){
			System.out.println("normal weight");
		}else if((bmi>=25)&&(bmi<30)) {
			System.out.println("overweight");
		}else if(bmi>=30){
			System.out.println("obese");
		}
		
	    

	}

}
