package rpg;

public class Character {

	public String name;
	public String job;
	public int hp;
	public int mp;
	public int level;
	public int exp;
	public int attackPower;
	public int defencePower;

	//初期化ブロック
	{
		System.out.println("初期化ブロック");
		level = 1;
	}
	
	//コンストラクタ
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
		message = character.name + "！"+ message;
		System.out.println(message);
	}

	public void attack(Character character) {
		int damage = 5;
		character.hp -= damage;
	}

}