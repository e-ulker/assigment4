package assigment_4_if_switch;
import java.util.Scanner;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of the package : ");
		int weight = scan.nextInt();
		System.out.println("Enter the mile");
		int mileData = scan.nextInt();
		int mile = ((mileData - 1) / 500) + 1;  // sadece miledata yazsak,500 girince 1+1 den 2 kabul edecek,halbuki 1 olmasý.
		double fee = 0;                        // Buyüzden (miledata-1) yaptýk  ki,500-1 den 0 a maruz kalsýn +1 den 1 okutsun. bu karýþýlýðý ortadan kaldýrdýk.
		if (weight <= 2)
			fee = 1.10;
		else if (weight <= 6)
			fee = 2.20;
		else if (weight <= 10)
			fee = 3.70;
		System.out.println("The shipping charge is $ " + fee * mile);
	
		
		

		
	
	}	

	}
