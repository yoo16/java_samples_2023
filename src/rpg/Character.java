package rpg;

import rpg.item.Armor;
import rpg.item.Item;
import rpg.item.ItemType;
import rpg.item.Shield;
import rpg.item.Weapon;
import rpg.magic.Magic;
import rpg.magic.MagicType;

public class Character implements ICharacter, IEquipment {

	public String name;
	public String job;
	public int hp;
	public int mp;
	public int level;
	public int exp;
	public int attackPower;
	public int defencePower;
	public Item weapon;
	public Item armor;
	public Item shield;

	// 初期化ブロック
	{
		System.out.println("初期化ブロック");
		level = 1;
	}

	// コンストラクタ
	public Character(String name, String job) {
		System.out.println("キャラクタ新規作成");
		this.name = name;
		this.job = job;
		this.hp = 50;
	}

	public Character(String name) {
		this.name = name;
		this.level = 1;
		this.exp = 0;
	}

	public void walk(String direction) {
		String message = this.name + " move " + direction;
		System.out.println(message);
	}

	public void talk(Character character, String message) {
		message = character.name + "！" + message;
		System.out.println(message);
	}

	public void attack(Character character) {
		int damage = 5;
		character.hp -= damage;
	}

	@Override
	public void attack(Monster monster) {
	}

	@Override
	public void attackMagic(Monster monster, Magic magic) {
		if (mp < 0)
			System.out.println("MPがたりない！");
		System.out.println(magic.name + "を唱えた！");
		if (magic.type == MagicType.ATTACK) {
			int damage = this.attackPower + magic.power - monster.defencePower;
			if (damage > 0)
				monster.hp -= damage;
			System.out.println(monster.name + "に" + magic.power + "のダメージ！");
		}
	}

	@Override
	public void defenceMagic(Magic magic) {
		if (mp < 0)
			System.out.println("MPがたりない！");
		System.out.println(magic.name + "を唱えた！");
		if (magic.type == MagicType.DEFENCE) {
			this.defencePower += magic.power;
			System.out.println(this.name + "の防御力が" + magic.power + "あがった！");
		} else if (magic.type == MagicType.HEAL) {
			this.hp += magic.power;
			System.out.println(this.name + "のHPが" + magic.power + "回復！");
		}
	}

	@Override
	public boolean isAlive() {
		return (this.hp < 0);
	}

	@Override
	public void equip(Item item) {
		this.defencePower += item.getDefencePower();
		this.attackPower += item.getAttackPower();
	}

	@Override
	public void equip(Weapon weapon) {
		this.weapon = weapon;
		equip(weapon);
	}

	@Override
	public void equip(Armor armor) {
		this.armor = armor;
		equip(armor);
	}

	@Override
	public void equip(Shield shield) {
		this.shield = shield;
		equip(shield);
	}

}