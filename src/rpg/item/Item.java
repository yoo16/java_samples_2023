package rpg.item;

public class Item {

	private Long id;
	private String name;
	private ItemType type;
	private Integer attackPower;
	private Integer defencePower;
	private Integer price;

	public Item() {
	}

	public Item(Long id, String name, ItemType type, Integer attackPower, Integer defencePower, Integer price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.attackPower = attackPower;
		this.defencePower = defencePower;
		this.price = price;
	}

	public Item(String name, Integer price, Integer attackPower, Integer defencePower) {
		this.name = name;
		this.attackPower = attackPower;
		this.defencePower = defencePower;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public Integer getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(Integer attackPower) {
		this.attackPower = attackPower;
	}

	public Integer getDefencePower() {
		return defencePower;
	}

	public void setDefencePower(Integer defencePower) {
		this.defencePower = defencePower;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
