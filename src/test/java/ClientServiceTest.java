import card.NoCard;
import card.StandardCard;
import org.junit.jupiter.api.Test;

import static card.CardStatus.*;
import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {
    @Test
    void CheckStandardCardStatusAtClient() {
        Client client = new Client(1, new StandardCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 500);

        assertEquals(STANDARD, client.getCard().getCardStatus());
    }

    @Test
    void CheckSilverCardStatusAtClient() {
        Client client = new Client(1, new StandardCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 15_001);

        assertEquals(SILVER, client.getCard().getCardStatus());
    }

    ;

    @Test
    void CheckGoldCardStatusAtClient() {
        Client client = new Client(1, new StandardCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 150_001);

        assertEquals(GOLD, client.getCard().getCardStatus());
    }

    ;

    @Test
    void CheckUpdateCardStatusAtClient() {
        Client client = new Client(1, new NoCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 0);
        assertEquals(NO, client.getCard().getCardStatus());

        service.buy(client, 1_000);
        assertEquals(STANDARD, client.getCard().getCardStatus());
        service.buy(client, 2_000);
        assertEquals(STANDARD, client.getCard().getCardStatus());

        service.buy(client, 14_005);
        assertEquals(SILVER, client.getCard().getCardStatus());
        service.buy(client, 2_000);
        assertEquals(SILVER, client.getCard().getCardStatus());

        service.buy(client, 150_000);
        assertEquals(GOLD, client.getCard().getCardStatus());
        service.buy(client, 20_000);
        assertEquals(GOLD, client.getCard().getCardStatus());
    }

    ;

    @Test
    void CheckUpdateAmountOfAllPurchasesAtClient() {
        Client client = new Client(1, new StandardCard(), 1_000, 50);
        ClientService service = new ClientService();

        service.buy(client, 2_000);

        assertEquals(3_000, client.getAmountOfAllPurchases());
    }

    @Test
    void CheckUpdateBonusesAtClient() {
        Client client = new Client(1, new StandardCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 1_000);
        service.buy(client, 2_000);

        assertEquals(150, client.getBonuses());
    }

    @Test
    void CheckUpdateBonusesAfterStatusChangeCard() {
        Client client = new Client(1, new NoCard(), 0, 0);
        ClientService service = new ClientService();

        service.buy(client, 1_000);
        service.buy(client, 15_000);
        service.buy(client, 1_000);

        assertEquals(820, client.getBonuses());
    }
}