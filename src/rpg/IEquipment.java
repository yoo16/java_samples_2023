package rpg;

import rpg.item.Item;
import rpg.item.Armor;
import rpg.item.Shield;
import rpg.item.Weapon;

public interface IEquipment {
    
    public void equip(Item item);
	public void equip(Weapon weapon);
	public void equip(Armor armor);
	public void equip(Shield shield);

}
