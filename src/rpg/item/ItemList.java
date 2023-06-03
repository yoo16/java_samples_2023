package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemList {

	private static String csvPath = "data/rpg/item.csv";
	public ArrayList<Item> list = new ArrayList<>();
	public Map<Long, Item> map = new HashMap<>();

	public ItemList() {
		this.loadCsv();
	}

	public void loadCsv() {
		FileInputStream file;
		InputStreamReader reader;
		BufferedReader buffer;

		try {
			file = new FileInputStream(csvPath);
			reader = new InputStreamReader(file);
			buffer = new BufferedReader(reader);

			String line = buffer.readLine();
			line.split(",");

			while ((line = buffer.readLine()) != null) {
				String[] data = line.split(",");

				Item item = new Item();
				Long id = Long.parseLong(data[0]);
				item.setId(id);
				item.setName(data[1]);
				item.setType(ItemType.getByValue(data[2]));
				item.setPrice(Integer.parseInt(data[3]));
				item.setAttackPower(Integer.parseInt(data[4]));
				item.setDefencePower(Integer.parseInt(data[5]));

				list.add(item);
				map.put(id, item);
			}
		} catch (Exception e) {
			System.out.println(csvPath + "が読み込めませんでした");
		} finally {

		}
	}
}
