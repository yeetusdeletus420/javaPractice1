package javaNew;
import java.util.Scanner;

public class conditionals1 {
	public static void main(String[] args) {
		
		int x = 7;
		int y = 10;
		int z = 673;
		
	//	> < == >= <= !=
	//  AND && ; OR || ; NOT !()  //
		
		boolean and = x==y && z!=z;
	//	System.out.println(and);
		boolean or = x+y==3 || y%x!=3;
	//	System.out.println(or);
		boolean not = !(!(x+y+z==690));
	//	System.out.println(not);
	
		boolean t = true;
		boolean f = false;
		
		boolean GrandComparison = !(t!=t) || f!=f&&t==t;
	//	System.out.println(GrandComparison);
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
	//	System.out.println(s);
	//	boolean hey = (s.equals("Filip"));
	//	System.out.println(hey);
		
		if (s.equals("Filip")) {
			System.out.print("Filip");
		}
		else if (s.equals("Fil")) {
			System.out.print("Fil");
		}
		else {
			System.out.print("siuuuuuuuuuuu");
		}
	}
}