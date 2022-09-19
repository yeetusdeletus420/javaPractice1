package javaNew;
import java.util.Scanner;
public class javaMath {
	
	public static void main(String[] args) {

		System.out.println("Addition");
		Scanner no1 = new Scanner(System.in);
		Scanner no2 = new Scanner(System.in);
		double n1 = no1.nextDouble();
		double n2 = no2.nextDouble();
		double addProduct = n1+n2;
		System.out.println(addProduct);
		System.out.print("Round? [Y] or [N]: ");
		Scanner rnd1 = new Scanner(System.in);
		String int1in = rnd1.next();
		if (int1in == "y" || int1in == "Y") {
			System.out.println(Math.round(addProduct));
		}
		else if (int1in == "n" || int1in == "N") {
			System.out.println("Answer still: "+addProduct);
		}

		System.out.println("Subtraction");
		Scanner no3 = new Scanner(System.in);
		Scanner no4 = new Scanner(System.in);
		double n3 = no1.nextDouble();
		double n4 = no2.nextDouble();
		double subProduct = n3+n4;
		System.out.println(subProduct);
		System.out.println("Round? [Y] or [N]: ");
		// carry off from here ... //
		
	}

}
