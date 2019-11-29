import card.*;

import static card.CardStatus.*;

public class ClientService {
    private static final int STANDARD_MIN_BORDER = 1;
    private static final int SILVER_MIN_BORDER = 15_001;
    private static final int GOLD_MIN_BORDER = 150_001;
    private static final int BONUS_ACCRUAL_FROM_THOUSANDS = 1_000;

    private boolean checkUpdateToStandard(Client client) {
        if (client.getCard().getCardStatus() == STANDARD) {
            return false;
        }
        if (client.getAmountOfAllPurchases() < STANDARD_MIN_BORDER) {
            return false;
        }
        if (client.getAmountOfAllPurchases() > SILVER_MIN_BORDER) {
            return false;
        }
        return true;
    }

    private boolean checkUpdateToSilver(Client client) {
        if (client.getCard().getCardStatus() == SILVER) {
            return false;
        }
        if (client.getAmountOfAllPurchases() < SILVER_MIN_BORDER) {
            return false;
        }
        if (client.getAmountOfAllPurchases() > GOLD_MIN_BORDER) {
            return false;
        }
        return true;
    }

    private boolean checkUpdateToGold(Client client) {
        if (client.getCard().getCardStatus() == GOLD) {
            return false;
        }
        if (client.getAmountOfAllPurchases() < GOLD_MIN_BORDER) {
            return false;
        }
        return true;
    }

    private void checkCardStatusUpdates(Client client) {
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

    private int getBonusesForCurrentPurchase(Client client, int purchaseAmount) {
        int bonuses = client.getCard().getBonusPerThousand() * (purchaseAmount / BONUS_ACCRUAL_FROM_THOUSANDS);
        return bonuses;
    }

    private void increaseAmountOfAllPurchases(Client client, int purchaseAmount) {
        client.setAmountOfAllPurchases(client.getAmountOfAllPurchases() + purchaseAmount);
    }

    private void increaseBonuses(Client client, int purchaseAmount) {
        int bonuses = getBonusesForCurrentPurchase(client, purchaseAmount);
        client.setBonuses(client.getBonuses() + bonuses);
    }

    public void buy(Client client, int purchaseAmount) {
        increaseAmountOfAllPurchases(client, purchaseAmount);
        increaseBonuses(client, purchaseAmount);
        checkCardStatusUpdates(client);
    }
}
