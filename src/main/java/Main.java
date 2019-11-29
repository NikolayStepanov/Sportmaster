import card.Card;
import card.GoldCard;
import card.SilverCard;
import card.StandardCard;

public class Main {
    public static void main(String[] args) {
        Card card = new GoldCard();
        Card card1 = new StandardCard();
        Card card2 = new SilverCard();

        System.out.println(card.getBonusPerThousand());
        System.out.println(card1.getBonusPerThousand());
        System.out.println(card2.getBonusPerThousand());
        Client client= new Client(1,card,200);
        client.setCard(new StandardCard());
        System.out.println(client.getCard().getCardStatus().getTitle());

    }
}
