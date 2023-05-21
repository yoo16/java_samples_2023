package cafe;

public enum Size {
    LARGE("大"), MEDIUM("中"), SMALL("小");

    private final String value;

    private Size(String value) {
		this.value = value;
	}

}
