package middleearthmadness.home;

import middlearthmadnesss.info.CharacterManager;
import middlearthmadnesss.info.Elf;
import middlearthmadnesss.info.MiddleEarthCharacter;


public class MiddleEarthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elf myElf = new Elf("Legolas", 5.0, 6.0);
			
			myElf.getCharacter();
			myElf.updateCharacter(myElf,"Galadriel",10.0,14.0);
			myElf.deleteCharacter();
			myElf.displayInfo();
			
	}

}
