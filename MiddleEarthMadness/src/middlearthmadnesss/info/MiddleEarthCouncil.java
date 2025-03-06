package middlearthmadnesss.info;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance = null;
	private CharacterManager characterManager;
	
	private MiddleEarthCouncil()
	{
		characterManager = new CharacterManager();
	}
	
	public CharacterManager getCharacterManager()
	{
		return characterManager;
	}
	
	public static MiddleEarthCouncil getinstance()
	{
		if(instance == null)
		{
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
}
