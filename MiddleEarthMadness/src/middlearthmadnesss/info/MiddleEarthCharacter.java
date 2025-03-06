package middlearthmadnesss.info;


public abstract class MiddleEarthCharacter 

{
	String name;
	double health;
	double power;
	
	
	
public MiddleEarthCharacter(String name, double health, double power) 
	{
        this.name = name;
        this.health = health;
        this.power = power;
	}

public abstract boolean attack(MiddleEarthCharacter target);
public abstract String GetRace();

public void displayInfo()
	{
		System.out.println("Character Name: " + this.name);
		System.out.println("Character Health: " + this.health);
		System.out.println("Power: " + this.power);
		System.out.println("Race: " + GetRace());

	}

}
