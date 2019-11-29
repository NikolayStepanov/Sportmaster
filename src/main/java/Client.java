import card.Card;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    int id;
    private Card card;
    int amountOfAllPurchases;
    int bonuses;

    public Client(int id, Card card, int amountOfAllPurchases, int bonuses) {
        this.id = id;
        this.card = card;
        this.amountOfAllPurchases = amountOfAllPurchases;
        this.bonuses = bonuses;
    }
}
