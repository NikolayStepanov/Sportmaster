import card.CardStatus;
import card.GoldCard;
import card.SilverCard;
import card.StandardCard;

import static card.CardStatus.*;

public class ClientService {
    private static final int STANDARD_MIN_BORDER = 1;
    private static final int SILVER_MIN_BORDER = 15_001;
    private static final int GOLD_MIN_BORDER = 150_001;

    private boolean checkUpdateToStandard(Client client) {
        if (client.getCard().getCardStatus().equals(STANDARD)) {
            return false;
        }
        if (client.getValueOfAllPurchases() < STANDARD_MIN_BORDER) {
            return false;
        }
        if (client.getValueOfAllPurchases() > SILVER_MIN_BORDER) {
            return false;
        }
        return true;
    }

    private boolean checkUpdateToSilver(Client client) {
        if (client.getCard().getCardStatus().equals(SILVER)) {
            return false;
        }
        if (client.getValueOfAllPurchases() < SILVER_MIN_BORDER) {
            return false;
        }
        if (client.getValueOfAllPurchases() > GOLD_MIN_BORDER) {
            return false;
        }
        return true;
    }

    private boolean checkUpdateToGold(Client client) {
        if (client.getCard().getCardStatus().equals(GOLD)) {
            return false;
        }
        if (client.getValueOfAllPurchases() < GOLD_MIN_BORDER) {
            return false;
        }
        return true;
    }

    public void checkCardStatusUpdates(Client client) {
        CardStatus cardStatus = client.getCard().getCardStatus();
        if (checkUpdateToStandard(client)) {
            client.setCard(new StandardCard());
        }
        if (checkUpdateToSilver(client)) {
            client.setCard(new SilverCard());
        }
        if (checkUpdateToGold(client)) {
            client.setCard(new GoldCard());
        }
    }
}
