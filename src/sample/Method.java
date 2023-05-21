package sample;

public class Method {

    public static void main(String[] args) {
        Float answer = calculate(2f);
        System.out.println(answer);

        // コンパイルエラー：クラスメソッドは直接実行できない
        // Float answer2 = calculate2(2f);

        int totalPrice = calculateTotalPrice(200, 5);
        System.out.println(totalPrice + "円");

        greet("東京　太郎");
        greet("東京　太郎", "晴れ");

		//演習1
		String message = loginMessage("東京 太郎");
		System.out.println(message);

		//演習2
		int point = calculatePoint(400);
		System.out.println(point + "pt");
		point = calculatePoint(400, 0.05f);
		System.out.println(point + "pt");
		
		//演習3
		totalPrice = calculateTotalPrice(200, 5);
		System.out.println(totalPrice + "円");

		totalPrice = (int) calculateTotalPrice(200, 5, 0.1f);
		System.out.println(totalPrice + "円");

		totalPrice = (int) calculateTotalPrice(0.1f, 200, 150, 300);
		System.out.println(totalPrice + "円");
    }

    public static Float calculate(Float x) {
        Float y = x + 5;
        // return で結果を返す
        return y;
    }

    public Float calculate2(Float x) {
        Float y = x + 5;
        return y;
    }

	static int calculateTotalPrice(int price, int amount) {
		int totalPrice = price * amount;
		return totalPrice;
	}

	static int calculateTotalPrice(int price, int amount, float tax) {
		float totalPrice = (float) price * (float) amount * (1 + tax);
		return (int) totalPrice;
	}

	static int calculateTotalPrice(float tax, int... prices) {
		float totalPrice = 0;
		for (int price : prices) {
			totalPrice += (float) price + tax;
		}
		return (int) totalPrice;
	}

	static int calculatePoint(int price) {
		float point = price * 0.01f;
		return (int) point;
	}

	static int calculatePoint(int price, float pointRate) {
		float point = (float) price * pointRate;
		return (int) point;
	}

    // 引数が1つのメソッド
    static void greet(String name) {
        System.out.println(name + "さん、こんにちは！");
    }

    // 引数が2つのメソッド
    static void greet(String name, String weather) {
        System.out.println(name + "さん。今日は" + weather + "ですね。");
    }

    static String loginMessage(String userName) {
		String message = "ようこそ、" + userName + "さん！";
		return message;
	}
	
}
