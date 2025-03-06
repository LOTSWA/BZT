package middlearthmadnesss.info;


public class Orc extends MiddleEarthCharacter  
{
	@Override
	public String GetRace()	  
	 {
		return "Orc";
	 }


	public Orc(String name, double health, double power)
	 {
		super(name,health,power);
	 }

	
 	@Override
	public boolean attack(MiddleEarthCharacter target)
	{
 		
 		double damage= 0;    
 		
 			if (target.GetRace().equals("Orc"))                
			{
				return false;
			}


			if (target.GetRace().equals("Elf"))
			{
				return false;
			}
			
			if (target.GetRace().equals("Human"))
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
