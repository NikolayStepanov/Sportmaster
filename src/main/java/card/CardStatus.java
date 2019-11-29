package card;

public enum CardStatus {
    STANDARD("Стандартный"),
    SILVER("Серебряный"),
    GOLD("Золотой"),
    NO("Нет");

    private String title;

    CardStatus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
