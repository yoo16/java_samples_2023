package rpg.item;

public class Item {

	public String name;
	public ItemType type;
	public int attackPower;
	public int defencePower;
	public int price;

	public Item() {
	}

	public Item(ItemType type, String name, int attackPower, int defencePower, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.attackPower = attackPower;
		this.defencePower = defencePower;
	}

	
}
