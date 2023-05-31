package rpg;

import rpg.item.Item;
import rpg.magic.Magic;

public interface ICharacter {

	public void attack(Monster monster);
	public void attackMagic(Monster monster, Magic magic) ;
	public void defenceMagic(Magic magic) ;
	public boolean isAlive();
	public void equip(Item item);

}
