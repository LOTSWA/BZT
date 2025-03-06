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
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power)
	{
		for (int i = 0; i < size; i++)
		{
			if (characters[i].equals(character))
			{
				if (characters[i].name != name || characters[i].health != health || characters[i].power != power)
				{
					return false;
				}
				characters[i].name = name;
				characters[i].health = health;
				characters[i].power = power;
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteCharacter(MiddleEarthCharacter character)
	{
		for (int i = 0; i < size; i++)
		{
			if (characters[i].equals(character))
			{
				System.arraycopy(characters, i + 1, characters, i, size - 1 - i);
				size --;
				return true;
			}
		}
		return false;
	}
	
	public void displayAllCharacters()
	{
		for (int i = 0; i < size; i++)
		{
			characters[i].displayInfo();
		}
	}
}
