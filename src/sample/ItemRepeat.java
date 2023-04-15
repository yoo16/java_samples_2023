package sample;

import java.util.Random;

public class ItemRepeat {
	public static void main(String[] args) {
		// for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				String plot = "(" + x + "," + y + ")";
				System.out.print(plot);
			}
			System.out.println();
		}

		// length
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		for (int i = 0; i < drinks.length; i++) {
			String drink = drinks[i];
			System.out.println(drink);
		}

		// foreach
		for (String drink : drinks) {
			System.out.println(drink);
		}

		// 問題1
		String[] items = { "PC", "TV", "エアコン" };
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

		// 問題2
		for (String item : items) {
			System.out.println(item);
		}

		// 問題3
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				int answer = x * y;
				System.out.print(answer + " ");
			}
			System.out.println();
		}

		// 問題4
		Random rand = new Random();
		String[] marks = { "○", "●" };

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				int markIndex = rand.nextInt(marks.length);
				String mark = marks[markIndex];
				String result = "|" + mark;
				System.out.print(result);
			}
			System.out.println("|");
		}

		// while
		int i = 0;
		while (i <= 10) {
			i++;
		}
		System.out.println("whileの結果：" + i);

		// break
		int currentNumber = 1;
		int maxNumber = 1000;
		int limit = 0;
		while (currentNumber < maxNumber) {
			if (currentNumber % 7 == 0) {
				System.out.println(currentNumber);
				limit++;
			}
			if (limit == 5) {
				break;
			}
			currentNumber++;
		}

		// do while
		i = 0;
		do {
			i++;
		} while (i <= 10);
		System.out.println(i);
	}
}