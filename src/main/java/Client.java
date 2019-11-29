import card.Card;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    int id;
    private Card card;
    int valueOfAllPurchases;

    public Client(int id, Card card, int valueOfAllPurchases) {
        this.id = id;
        this.card = card;
        this.valueOfAllPurchases = valueOfAllPurchases;
    }
}
