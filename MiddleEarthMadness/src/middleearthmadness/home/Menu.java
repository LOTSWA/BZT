package middleearthmadness.home;
import java.util.*;

public class Menu{
	 public static void mainMenu(){
		System.out.println("What Would you like to do \n");
		System.out.println("1 Add new Character\n");
		System.out.println("2 View all Characters\n");
		System.out.println("3 Upade a character\n");
		System.out.println("4 Delete a character\n");
		System.out.println("5 Execute all characters' attack actions\n");
		System.out.println("6 Exit\n");
		
		Scanner myobj = new Scanner(System.in);
		String input = myobj.nextLine();
		System.out.println("option" + input);
	}
}





