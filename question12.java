package assigment_4_if_switch;

import java.util.Scanner;

//ctrl d sil sat�r sil

public class question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("plese enter a condition A,B,C");

		char letter = scan.next().charAt(0); // 1.harfe ihtiyac�m�z var.bt�n harflere ihtiyac�m�z yok.1.charaktere
												// ihtiyac�m�z var ilk harf 0

		System.out.println("please enter the using hour");
		int hour = scan.nextInt();
		double money;
		switch (letter) {
		case 'A':
			if (hour > 10) {
				money = (hour - 10) * 2 + 9.95;
				System.out.println("price=" + money + "$");
			}
			break;
		case 'B':

			if (hour > 20) {
				money = (hour - 20) * 1 + 13.95;
				System.out.println("price=" + money + "$");
			}
			break;

		case 'C':
			money = 19.95;
			System.out.println("unlimited net, only price=" + money);
			break;

		}

	} //control shift f d�zenler
	//ctrl space tamamlar
	//control sh�ft o import scan �a��r�r.

}
