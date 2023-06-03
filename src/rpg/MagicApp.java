package rpg;

import rpg.magic.MagicList;

public class MagicApp {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("チャーリー");
		Monster monster = new Monster();
		MagicList magicList = new MagicList();

		wizard.attackMagic(monster, magicList.get("fire"));
		wizard.defenceMagic(magicList.get("protec"));
		wizard.defenceMagic(magicList.get("heal"));
	}

}
