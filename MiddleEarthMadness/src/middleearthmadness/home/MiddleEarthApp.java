package middleearthmadness.home;

import middlearthmadnesss.info.CharacterManager;
import middlearthmadnesss.info.Dwarf;
import middlearthmadnesss.info.Elf;
import middlearthmadnesss.info.Human;
import middlearthmadnesss.info.MiddleEarthCharacter;
import middlearthmadnesss.info.MiddleEarthCouncil;
import middlearthmadnesss.info.Orc;
import middlearthmadnesss.info.Wizard;

public class MiddleEarthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleEarthCouncil council = MiddleEarthCouncil.getinstance();
		CharacterManager manage = council.getCharacterManager();


        manage.addCharacter(new Human("Tim", 100.00, 50.00));
        manage.addCharacter(new Human("Jeff", 500.00, 80.00));
        manage.addCharacter(new Human("Glass", 6.00, 500.00));
        manage.addCharacter(new Elf("Zach", 6.00, 500.00));


        System.out.println("Every character in your roster: ");
        manage.displayAllCharacters();

        MiddleEarthCharacter character = manage.getCharacter("Jeff");
        manage.updateCharacter(character, "Hit", 150, 700);

        System.out.println("Every character in your roster: ");
        manage.displayAllCharacters();

        //manage.updateCharacter("Jeff", "Zach", 150, 500);
        character = manage.getCharacter("Glass");
        manage.deleteCharacter(character);

        System.out.println("before battle: ");
        manage.displayAllCharacters();

        MiddleEarthCharacter fighter1 = manage.getCharacter("Tim");
        MiddleEarthCharacter fighter2 = manage.getCharacter("Zach");


        fighter2.attack(fighter1);

        System.out.println("After battle: ");
        manage.displayAllCharacters();
	}

}
