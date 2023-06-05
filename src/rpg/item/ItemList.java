package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemList {

	private final static String CSV_PATH = "data/rpg/item.csv";
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
			file = new FileInputStream(CSV_PATH);
			reader = new InputStreamReader(file, "UTF-8");
			buffer = new BufferedReader(reader);

			String line = buffer.readLine();
			System.out.println(line);

			while ((line = buffer.readLine()) != null) {
				String[] data = line.split(",");

				Long id = Long.parseLong(data[0]);
				String name = data[1];
				ItemType type = ItemType.valueOf(data[3].toUpperCase());
				Integer price = Integer.parseInt(data[3]);
				Integer attackPower = Integer.parseInt(data[4]);
				Integer defencePower = Integer.parseInt(data[5]);

				Item item = new Item(id, name, type, price, attackPower, defencePower);
				list.add(item);
				map.put(id, item);
			}
		} catch (FileNotFoundException e) {
			System.out.println(CSV_PATH + "が読み込めませんでした");
		} catch (IOException e) {
			System.out.println("データエラー");
		} catch (Exception e) {
			System.out.println("予期せぬエラー");
		}
	}
}