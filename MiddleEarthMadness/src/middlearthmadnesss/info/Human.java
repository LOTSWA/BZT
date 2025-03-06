package middlearthmadnesss.info;

public class Human extends MiddleEarthCharacter  
{
	@Override
	public String GetRace()	  
	 {
		return "Human";
	 }


	public Human(String name, double health, double power)
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


			if (target.GetRace().equals("Human"))
			{
				return false;
			}
			
			if (target.GetRace().equals("Wizard"))
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