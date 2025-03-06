package middlearthmadnesss.info;

public class CharacterManager {
	
	public MiddleEarthCharacter[] characters;
	public int size;
	
	public CharacterManager()
	{
		characters = new MiddleEarthCharacter[1];
		size = 0;
	}
	
	public boolean addCharacter(MiddleEarthCharacter c)
	{
		if (size == characters.length)
		{
			MiddleEarthCharacter[] temp = new MiddleEarthCharacter[characters.length * 2];
			System.arraycopy(characters, 0, temp, 0, characters.length);
			characters = temp;
		}
		characters[size++] = c;
		return true;
	}
}
