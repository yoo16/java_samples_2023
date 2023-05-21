package cafe;

public class Drink {

	public String name;
	public Integer price;
    //Size型のプロパティ
	public Size size;

	public Drink(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

    //Size型を引数とするコンストラクタ
	public Drink(String name, Integer price, Size size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

}