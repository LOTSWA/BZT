package middlearthmadnesss.info;

public class Elf extends MiddleEarthCharacter  
{
	@Override
	public String GetRace()	  
	 {
		return "Elf";
	 }


	public Elf(String name, double health, double power)
	 {
		super(name,health,power);
	 }

	
 	@Override
	public boolean attack(MiddleEarthCharacter target)
	{
 		
 		double damage= 0;    
 		
 			if (target.GetRace().equals("Dwarf"))                
			{
				return false;
			}


			if (target.GetRace().equals("Elf"))
			{
				return false;
			}
			
			if (target.GetRace().equals("Orc"))
			{
				damage = 1.5 *power;
			}
			
			else
			{
				damage= power;
			}
			
			target.health-=damage;
			return true;				
	}
 	
}
