
package middlearthmadnesss.info;

public class CharacterManager {
	
	/**
	 * the array of middle earth characters and the size of the array
	 */
	public MiddleEarthCharacter[] characters;
	public int size;
	
	/**
	 * constructor for character manager, init the array and size
	 */
	public CharacterManager()
	{
		characters = new MiddleEarthCharacter[1];
		size = 0;
	}
	
	/**
	 * This method will add a character
	 * @param c
	 * 			this argument is the character that is being added
	 * @return
	 * 			returns true for when the character is successfully added to
	 * 			the roster of characters
	 */
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
	
	/**
	 * this function gets the information about the character
	 * @param name	
	 * 				name is the parameter passed in to compare and find
	 * 				the correct character
	 * @return
	 * 			returns the character when they are found
	 * 			returns NULL if the name isn't in the roster of characters
	 */
	public MiddleEarthCharacter getCharacter(String name)
	{
		for (int i = 0; i < size; i++)
		{
			if (characters[i].name == name)
			{
				return characters[i];
			}
		}
		return null;
	}
	
	/**
	 * this method updates the characters information, i.e. name, health and/or power
	 * @param character
	 * 					character is the parameter that is edited
	 * @param name
	 * 					name is the attribute that may be edited
	 * @param health
	 * 					health is the attribute that may be edited
	 * @param power
	 * 					power is the attribute that may be edited
	 * @return
	 * 					returns true if the character was edited in any way
	 * 					returns false if either the character was not found
	 * 					or if the character was not edited
	 */
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power)
	{
		for (int i = 0; i < size; i++)
		{
			if (characters[i].equals(character))
			{
				if (characters[i].name != name || characters[i].health != health || characters[i].power != power)
				{
					characters[i].name = name;
					characters[i].health = health;
					characters[i].power = power;
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	/**
	 * this method deletes the character that's passed in, then shifts the array
	 * @param character
	 * 					character is compared to all characters in the array
	 * 					then when it's hit we index to it and start the copy, deleting the character
	 * @return
	 * 			returns true if the character was successfully removed
	 * 			returns false if the character is either not found or NULL
	 */
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
	
	/**
	 * this method loops through all the characters within the array and
	 * 	calls displayInfo to display each one
	 */
	public void displayAllCharacters()
	{
		for (int i = 0; i < size; i++)
		{
			characters[i].displayInfo();
		}
	}
}
