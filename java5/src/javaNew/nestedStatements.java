package javaNew;
import java.util.Scanner;

public class nestedStatements {
	public static void main(String[] args) {

	//	System.out.println("Enter your age (no. of years): ");
	//	Scanner ageScan = new Scanner(System.in);
	//	int age = ageScan.nextInt();
		
	//	if (age >= 12) {
	//		System.out.println("Go ahead LOL");
	//	}
	//	else if (age < 12) {
	//		System.out.println("You cannot ride. Die.");
	//	}
				
		System.out.print("Enter your age: ");
		Scanner newer = new Scanner(System.in);
		int newest = newer.nextInt();
		if(13 <= newest && newest <= 19) {
			System.out.println("You're a teenager.");
		
			elseif(newest >= 20 && newest <= 60); {
				System.out.println("You're an adult.");
			}
			elseif(newest < 12); {
				System.out.println("You're not a teenager, but a young kid.");
			}
			elseif(newest>60); {
				System.out.println("You're truly old!");
			}
		}
		
		System.out.println("[P]aimon, [S]ushi, [T]akoyaki, [R]amen");
		String p = "P";
		String s = "S";
		String t = "T";
		String r = "R";
		System.out.print("Type the character of your favourite food of these options: ");
		Scanner whatFood = new Scanner(System.in);
		String food = whatFood.nextLine();
		if (food == "P" || food == "p") {
			System.out.println("WTF is wrong with you XD");
		}
		elseif (food == "S" || food == "s"); {
			System.out.println("Sushi's lit. I agree.");
		}
		elseif (food == "T" || food == "t"); {
			System.out.println("Takoyaki is the shit! Let's go.");
		}
		elseif (food == "R" || food == "r"); {
			System.out.println("Mmm. The umami is dope!");
		}
		elseif(upperCase.food!="P"|'S'|"T"|'R'); {
			System.out.println("I hope it's not that you're uncultured, but that you just don't like anything here... oh well.");
		}
		
		// what could possibly be wrong here ? //
	}
}
